package com.myinfosysprogram.retrofit

class Resource<T>(
    mStatus: Status,
    mDdata: T?,
    mMessage: String?,
    mCcode: Int,
    mSuccess: Boolean
) {
    var status: Status? = null

    var message: String? = null

    var success = false

    var data: T? = null

    var code = 0

    init {
        status = mStatus
        data = mDdata
        message = mMessage
        code = mCcode
        success = mSuccess
    }

    companion object {
        fun <T> success(data: T?, code: Int): Resource<T>? {
            return Resource(Status.SUCCESS, data, null, code, true)
        }

        fun <T> error(
            msg: String?,
            data: T?,
            code: Int
        ): Resource<T>? {
            return Resource(Status.ERROR, data, msg, code, false)
        }

        fun <T> loading(data: T?, code: Int): Resource<T>? {
            return Resource(Status.LOADING, data, null, code, false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (!(other != null && javaClass == other.javaClass)
        ) {
            return false
        }
        val resource =
            other as Resource<*>
        if (status != resource.status) {
            return false
        }
        if (if (message != null) message != resource.message else resource.message != null) {
            return false
        }
        return if (data != null) data == resource.data else resource.data == null
    }

    override fun hashCode(): Int {
        var result = status.hashCode()
        result = 31 * result + (message?.hashCode() ?: 0)
        result = 31 * result + (data?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Resource{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}'
    }
}
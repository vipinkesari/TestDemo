package com.myinfosysprogram.retrofit

class Resource<T> {
    var status: Status? = null

    var message: String? = null

    var Success = false

    var data: T? = null

    var code = 0

    constructor(
        mStatus: Status,
        mDdata: T?,
        mMessage: String?,
        mCcode: Int,
        mSuccess: Boolean
    ) {
        status = mStatus
        data = mDdata
        message = mMessage
        code = mCcode
        Success = mSuccess
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

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val resource =
            o as Resource<*>
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
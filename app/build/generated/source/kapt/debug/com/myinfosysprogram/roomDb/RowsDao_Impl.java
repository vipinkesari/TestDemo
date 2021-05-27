package com.myinfosysprogram.roomDb;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.myinfosysprogram.model.response.PhotoRows;
import com.myinfosysprogram.model.response.UserRows;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RowsDao_Impl implements RowsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PhotoRows> __insertionAdapterOfPhotoRows;

  private final EntityInsertionAdapter<UserRows> __insertionAdapterOfUserRows;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  private final SharedSQLiteStatement __preparedStmtOfNukeUserTable;

  public RowsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhotoRows = new EntityInsertionAdapter<PhotoRows>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `list_rows` (`id`,`title`,`url`,`thumbnailUrl`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoRows value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThumbnailUrl());
        }
      }
    };
    this.__insertionAdapterOfUserRows = new EntityInsertionAdapter<UserRows>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_rows` (`id`,`name`,`username`,`email`,`phone`,`website`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRows value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsername());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getWebsite());
        }
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM list_rows";
        return _query;
      }
    };
    this.__preparedStmtOfNukeUserTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user_rows";
        return _query;
      }
    };
  }

  @Override
  public Object insertRow(final PhotoRows rows, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPhotoRows.insert(rows);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertUserRow(final UserRows rows, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserRows.insert(rows);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public void nukeUserTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeUserTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeUserTable.release(_stmt);
    }
  }

  @Override
  public List<PhotoRows> getAllRows() {
    final String _sql = "Select * from list_rows";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
      final List<PhotoRows> _result = new ArrayList<PhotoRows>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PhotoRows _item;
        _item = new PhotoRows();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _item.setUrl(_tmpUrl);
        final String _tmpThumbnailUrl;
        if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
          _tmpThumbnailUrl = null;
        } else {
          _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
        }
        _item.setThumbnailUrl(_tmpThumbnailUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserRows> getAllUserRows() {
    final String _sql = "Select * from user_rows";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
      final List<UserRows> _result = new ArrayList<UserRows>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserRows _item;
        _item = new UserRows();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        _item.setUsername(_tmpUsername);
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        _item.setEmail(_tmpEmail);
        final String _tmpPhone;
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _tmpPhone = null;
        } else {
          _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item.setPhone(_tmpPhone);
        final String _tmpWebsite;
        if (_cursor.isNull(_cursorIndexOfWebsite)) {
          _tmpWebsite = null;
        } else {
          _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
        }
        _item.setWebsite(_tmpWebsite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

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
import com.myinfosysprogram.model.response.ListResponse;
import com.myinfosysprogram.model.response.Rows;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RowsDao_Impl implements RowsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Rows> __insertionAdapterOfRows;

  private final EntityInsertionAdapter<ListResponse> __insertionAdapterOfListResponse;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public RowsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRows = new EntityInsertionAdapter<Rows>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `list_rows` (`id`,`title`,`description`,`image_href`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rows value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getImageHref() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageHref());
        }
      }
    };
    this.__insertionAdapterOfListResponse = new EntityInsertionAdapter<ListResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ListResponse` (`title`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ListResponse value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
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
  }

  @Override
  public Object insertRow(final Rows rows, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRows.insert(rows);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertTitle(final ListResponse title, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfListResponse.insert(title);
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
  public List<Rows> getAllRows() {
    final String _sql = "Select * from list_rows";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImageHref = CursorUtil.getColumnIndexOrThrow(_cursor, "image_href");
      final List<Rows> _result = new ArrayList<Rows>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Rows _item;
        _item = new Rows();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final String _tmpImageHref;
        _tmpImageHref = _cursor.getString(_cursorIndexOfImageHref);
        _item.setImageHref(_tmpImageHref);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ListResponse> getTitle() {
    final String _sql = "Select * from ListResponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final List<ListResponse> _result = new ArrayList<ListResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ListResponse _item;
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item = new ListResponse(_tmpTitle);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}

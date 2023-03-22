package com.example.SecondHandGame.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Post> __insertionAdapterOfPost;

  private final EntityDeletionOrUpdateAdapter<Post> __deletionAdapterOfPost;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPost = new EntityInsertionAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Post` (`key`,`name`,`price`,`email`,`description`,`avatarUrl`,`cb`,`lastUpdated`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        if (value.key == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.key);
        }
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        if (value.price == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.price);
        }
        if (value.email == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.email);
        }
        if (value.description == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.description);
        }
        if (value.avatarUrl == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.avatarUrl);
        }
        final Integer _tmp = value.cb == null ? null : (value.cb ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.lastUpdated == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.lastUpdated);
        }
      }
    };
    this.__deletionAdapterOfPost = new EntityDeletionOrUpdateAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Post` WHERE `key` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        if (value.key == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.key);
        }
      }
    };
  }

  @Override
  public void insertAll(final Post... posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPost.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Post post) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPost.handle(post);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Post>> getAll() {
    final String _sql = "select * from Post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Post"}, false, new Callable<List<Post>>() {
      @Override
      public List<Post> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarUrl");
          final int _cursorIndexOfCb = CursorUtil.getColumnIndexOrThrow(_cursor, "cb");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            _item = new Post();
            if (_cursor.isNull(_cursorIndexOfKey)) {
              _item.key = null;
            } else {
              _item.key = _cursor.getString(_cursorIndexOfKey);
            }
            if (_cursor.isNull(_cursorIndexOfName)) {
              _item.name = null;
            } else {
              _item.name = _cursor.getString(_cursorIndexOfName);
            }
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _item.price = null;
            } else {
              _item.price = _cursor.getString(_cursorIndexOfPrice);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _item.email = null;
            } else {
              _item.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _item.description = null;
            } else {
              _item.description = _cursor.getString(_cursorIndexOfDescription);
            }
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _item.avatarUrl = null;
            } else {
              _item.avatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfCb)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfCb);
            }
            _item.cb = _tmp == null ? null : _tmp != 0;
            if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
              _item.lastUpdated = null;
            } else {
              _item.lastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Post getPostById(final String postId) {
    final String _sql = "select * from Post where `key` = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (postId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, postId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarUrl");
      final int _cursorIndexOfCb = CursorUtil.getColumnIndexOrThrow(_cursor, "cb");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final Post _result;
      if(_cursor.moveToFirst()) {
        _result = new Post();
        if (_cursor.isNull(_cursorIndexOfKey)) {
          _result.key = null;
        } else {
          _result.key = _cursor.getString(_cursorIndexOfKey);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _result.name = null;
        } else {
          _result.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPrice)) {
          _result.price = null;
        } else {
          _result.price = _cursor.getString(_cursorIndexOfPrice);
        }
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _result.email = null;
        } else {
          _result.email = _cursor.getString(_cursorIndexOfEmail);
        }
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _result.description = null;
        } else {
          _result.description = _cursor.getString(_cursorIndexOfDescription);
        }
        if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
          _result.avatarUrl = null;
        } else {
          _result.avatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
        }
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfCb)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfCb);
        }
        _result.cb = _tmp == null ? null : _tmp != 0;
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _result.lastUpdated = null;
        } else {
          _result.lastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
        }
      } else {
        _result = null;
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

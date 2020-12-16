
package com.agrisolutions.sqlite_module;

import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAgriSqliteModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAgriSqliteModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }
  private String TAG = "RNAgriSqlite";
  private RNDatabase rnDatabase;

  public void showToast(String msg) {
    Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_SHORT).show();
  }

  @Override
  public String getName() {
    return "RNAgriSqlite";
  }

  @ReactMethod
  public void CreateDatabase(String nameDb) {
    rnDatabase = new RNDatabase(reactContext, nameDb, null, 1);
  }

  @ReactMethod
  public void CreateTable(String sql) {
    rnDatabase.QueryData(sql);
  }


  @ReactMethod
  public void Insert(String sql) {
    rnDatabase.QueryData(sql);
  }
}
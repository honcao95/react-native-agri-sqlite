
# react-native-agri-sqlite

## Getting started

`$ npm install react-native-agri-sqlite --save`

### Mostly automatic installation

`$ react-native link react-native-agri-sqlite`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAgriSqlitePackage;` to the imports at the top of the file
  - Add `new RNAgriSqlitePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-agri-sqlite'
  	project(':react-native-agri-sqlite').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-agri-sqlite/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-agri-sqlite')
  	```


## Usage
```javascript
import RNAgriSqlite from 'react-native-agri-sqlite';

// TODO: What to do with the module?
RNAgriSqlite;
```
  
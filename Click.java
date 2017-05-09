protected void onCreate(Bundle savedInstanceState) {
	...
	// Define a listener that corresponds to clicks on a file in the ListView
	mFileListView.setOnItemClickListener(
		new AdapterView.OnItemClickListener() {
			@Override
			/**
			 * When a filename in the ListView is clicked,
			 * get its content URI and send it to the requesting app.
			 */
			public void onItemClick(AdapterView<?> adapterView, 
				View view, int position, long rowId) {
				/**
				 * Get a File for the selected file name.
				 * Assume that the filenames are in the 
				 * mImageFilename array.
				 */
				File requestFile = new File(mImageFilename[position]);

				/**
				 * Most file-related method calls need to be 
				 * in try-catch blocks.
				 */
				try {
					fileUri = FileProvider.getUriForFile(MainActivity.this,
						"com.example.myapp.fileprovider", requestFile);
				} catch(IllegalArgumentException e) {
					Log.e("File Selector", "The selected file can't be shared : "
						+ clickedFilename);
				}
			}
		});
}
/**
 * Grant permissions for the File.
 */
protected void onCreate(Bundle savedInstanceState) {
	...
	// Define a listener that responds to clicks in the ListView
	mFileListView.setOnClickListener(
		new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, 
				View view, int position, long rowId) {
				// ...
				if(fileUri != null) {
					// Grant temporary read permission to the content URI
					mResultIntent.addFlags(
						Intent.FLAG_GRANT_READ_URI_PERMISSION);
				}
			}
		});
}
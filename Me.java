public class MainActivity extends Activity {
	// The path to the root of this app's internal storage
	private File mPrivateRootDir;

	// The path to the "image" subdirectory
	private File mImagesDir;

	// Array of files in the images subdirectory
	File[] mImageFiles;

	// Array of filenames corresponding to mImageFiles
	String[] mImageFilenames;

	// Initialize the activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent mResultIntent = 
			new Intent("com.example.myapp.ACTION_RETURN_FILE");

		// Get the files/ subdirectory of internal storage
		mPrivateRootDir = getFilesDir();

		// Get the files/Images subdirectory
		mImagesDir = new File(mPrivateRootDir, "images");

		// Get the files in the images subdirectory
		mImageFiles = mImagesDir.listFiles();

		// Set the Activity's result to null to begin with
		setResult(Activity.RESULT_CANCELED, null);

		/**
		 * Display the file names in the ListView mFileListView.
		 * Back the ListView with the array mImageFilenames, which 
		 * you can create by iterating through mImageFiles and 
		 * calling File.getAbsolutePath() for each File
		 */
	}
}
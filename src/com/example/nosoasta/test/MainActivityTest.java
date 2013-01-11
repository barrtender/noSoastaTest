/**
 * 
 */
package com.example.nosoasta.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.TextView;

import com.example.nosoasta.MainActivity;

/**
 * @author barreri
 *
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	
	private Button mButton;
	private TextView mTextView;
	/**
	 * @param name
	 */
	@SuppressWarnings("deprecation")
	public MainActivityTest() {
		super("com.example.nosoasta", MainActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		mButton = (Button)getActivity().findViewById(com.example.nosoasta.R.id.button1);
		mTextView = (TextView)getActivity().findViewById(com.example.nosoasta.R.id.textView1);
	}
	
	public void testPreconditions() {
		assertTrue(mButton.getText().toString().equals("Button"));
		assertTrue(mTextView.getText().toString().equals("Hello world!"));
	}
	
	@UiThreadTest
	public void testButtonPress() throws InterruptedException {
		mButton.performClick();
		assertTrue(mTextView.getText().toString().equals("Button pressed"));
		mButton.performClick();
		assertTrue(mTextView.getText().toString().equals("Button pressed again"));
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}

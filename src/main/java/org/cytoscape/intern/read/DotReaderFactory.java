package org.cytoscape.intern.read;

import java.io.InputStream;

import org.cytoscape.io.CyFileFilter;
import org.cytoscape.io.read.InputStreamTaskFactory;
import org.cytoscape.work.TaskIterator;

public class DotReaderFactory implements InputStreamTaskFactory {

	@Override
	public CyFileFilter getFileFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskIterator createTaskIterator(InputStream inStream, String inputName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReady(InputStream inStream, String inputName) {
		// TODO Auto-generated method stub
		return false;
	}

}

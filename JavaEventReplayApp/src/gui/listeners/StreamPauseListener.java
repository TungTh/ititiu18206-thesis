package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.components.StreamLogPane;
import gui.components.StreamPanel;
import gui.components.StreamTopicPane;

public class StreamPauseListener implements ActionListener {
	
	private StreamTopicPane stp;
	private StreamLogPane slp;
	private StreamPanel sp;
	
	public StreamPauseListener(StreamTopicPane a, StreamLogPane b, StreamPanel c) {
		this.stp = a;
		this.slp = b;
		this.sp = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.stp.getPauseStreamBtn().setEnabled(false);
		this.stp.getDeleteStreamBtn().setEnabled(true);
		this.stp.getStartStreamBtn().setEnabled(true);
	}

	public StreamLogPane getStreamLogPane() {
		return slp;
	}

	public StreamPanel getStreamPanel() {
		return sp;
	}
}

package com.wedeploy.jrsmq;

public class QueueMessage {
	private final String id;
	private final String message;
	private final long rc;
	private final long fr;
	private final long sent;

	public QueueMessage(String id, String message, long rc, long fr, long sent) {
		this.id = id;
		this.message = message;
		this.rc = rc;
		this.fr = fr;
		this.sent = sent;
	}

	public String id() {
		return id;
	}

	public String message() {
		return message;
	}

	public long rc() {
		return rc;
	}

	public long fr() {
		return fr;
	}

	public long sent() {
		return sent;
	}
}

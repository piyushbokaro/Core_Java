package com.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class TestScatteringAndGatheringNIO {
	public static void main(String params[]) throws IOException {
		String data = "Scattering and Gathering example shown in howtodoinjava.com";
		gatherBytes(data, data.length());
		scatterBytes();

		// ToTransfer from onechannel to other channel
		/*
		 * RandomAccessFile fromFile = new RandomAccessFile("test.txt", "rw");
		 * FileChannel fromChannel = fromFile.getChannel();
		 * 
		 * RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
		 * FileChannel toChannel = toFile.getChannel();
		 * 
		 * long position = 0; long count = fromChannel.size();
		 * 
		 * fromChannel.transferTo(position, count, toChannel);
		 */
	}

	/*
	 * gatherBytes() reads bytes from different buffers and writes to file
	 * channel. Note that it uses a single write for both the buffers.
	 */
	public static void gatherBytes(String data, int dataLength) {
		String dataTwo = "Allstate Example";
		// First Buffer holds a random number
		ByteBuffer bufferOne = ByteBuffer.allocate(4);

		// Second Buffer holds data we want to write
		ByteBuffer bufferTwo = ByteBuffer.allocate(150);

		// Third Buffer holds data we want to write
		ByteBuffer bufferThree = ByteBuffer.allocate(100);

		// Writing Data sets to Buffer
		bufferOne.asIntBuffer().put(23);
		bufferTwo.asCharBuffer().put(data);
		bufferThree.asCharBuffer().put(dataTwo);
		// Calls FileOutputStream(file).getChannel()
		GatheringByteChannel gatherer = createChannelInstance("test.txt", true);

		// Write data to file
		try {
			gatherer.write(new ByteBuffer[] { bufferOne, bufferTwo, bufferThree });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * scatterBytes() read bytes from a file channel into a set of buffers. Note
	 * that it uses a single read for both the buffers.
	 */
	public static void scatterBytes() {
		// First Buffer holds a random number
		ByteBuffer bufferOne = ByteBuffer.allocate(4);

		// Second Buffer holds data we want to write
		ByteBuffer bufferTwo = ByteBuffer.allocate(200);

		// Third Buffer holds data we want to write
		ByteBuffer bufferThree = ByteBuffer.allocate(200);

		// Calls FileInputStream(file).getChannel()
		ScatteringByteChannel scatterer = createChannelInstance("test.txt",
				false);

		try {
			// Reading from the channel
			scatterer
					.read(new ByteBuffer[] { bufferOne, bufferTwo, bufferThree });
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Read the buffers seperately
		bufferOne.rewind();
		bufferTwo.rewind();
		bufferThree.rewind();

		int bufferOneContent = bufferOne.asIntBuffer().get();
		String bufferTwoContent = bufferTwo.asCharBuffer().toString();
		String bufferThreeContent = bufferThree.asCharBuffer().toString();

		// Verify the content
		System.out.println(bufferOneContent);
		System.out.println(bufferTwoContent);
		System.out.println(bufferThreeContent);
	}

	public static FileChannel createChannelInstance(String file,
			boolean isOutput) {
		FileChannel fc = null;
		try {
			if (isOutput) {
				fc = new FileOutputStream(file).getChannel();
			} else {
				fc = new FileInputStream(file).getChannel();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fc;
	}
}

package com.test.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFileWithFixedSizeBuffer
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile aFile = new RandomAccessFile
                ("test.txt", "r");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(inChannel.read(buffer) > 0)
        {
            buffer.flip();
            for (int i = 0; i < buffer.limit(); i++)
            {
                System.out.print((char) buffer.get());
            }
            buffer.compact(); // do something with the data and clear/compact it.
        }
        inChannel.close();
        aFile.close();
    }
}

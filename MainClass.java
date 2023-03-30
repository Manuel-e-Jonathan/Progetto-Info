package model;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass
{
    public static ArrayList<String> readFile() throws IOException
    {
        return LetturaDaFile.readFile();
    }
}
package com.example.cartservice;

import org.json.simple.JSONObject;
import org.json.simple.JSONObject;

public class Store
{

    public JSONObject getStoreItems(String category)
    {
        JSONObject file = new JSONObject();
        if(category.equalsIgnoreCase("all"))
        {
            file.put("Item1","hat");
            file.put("Item2","hoddie");
            file.put("Item3","shoes");
            file.put("Item4","t-shirt");
        }
        else
        {
            file.put("Item1",category);
        }

        System.out.println("getStoreItem was invoked");
        return file;
    }
}

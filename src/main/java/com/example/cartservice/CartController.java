package com.example.cartservice;



import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;
//import org.springframework.hateoas.mvc.ControllerLinkBuilder;

@RestController
public class CartController
{

    @GetMapping("/store/getItemList")
    public JSONObject getItems(@RequestParam(value = "category", defaultValue = "all") String category)
    {
        Store store = new Store();
        return store.getStoreItems(category);
    }

    @PostMapping("/store/koko")
    @ResponseBody
    public String addKoko(@RequestParam(name = "id") String kokoId, @RequestParam String name)
    {
        return "ID: " + kokoId + " Names: " + name;
    }


}

import models.Backpack;
import models.Item;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Guest on 8/9/17.
 */
public class App {
    public static void main(String[] args) {
        get("/",(req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/backpacks/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String bpselection = request.queryParams("beSelection");
            System.out.println(bpselection);
            Backpack newBackpack = new Backpack(bpselection);
            model.put("backpack", newBackpack);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}

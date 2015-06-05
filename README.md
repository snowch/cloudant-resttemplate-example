##Overview

This project is an example of making a REST API call to Cloudant using Spring RestTemplate

##Usage 

To run the project, enter the following command:

```./gradle clean build run```

You should see some JSON in the output from the above command:

```
...
{
  "total_rows": 5,
  "offset": 0,
  "rows": [
    {
      "id": "kookaburra",
      "key": "Dacelo novaeguineae",
      "value": 19,
      "doc": {
        "_id": "kookaburra",
        "_rev": "4-6038cf35dfe1211f85484dec951142c7",
        "min_length": 0.28,
        "max_length": 0.42,
        "wiki_page": "http:\/\/en.wikipedia.org\/wiki\/Kookaburra",
        "class": "bird",
        "diet": "carnivore",
        "latin_name": "Dacelo novaeguineae"
      }
    },
    ... 
  ]
}
...
```

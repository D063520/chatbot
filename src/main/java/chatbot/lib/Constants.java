package chatbot.lib;

import java.util.HashMap;

/**
 * Created by ramgathreya on 6/21/17.
 */
public interface Constants {
    int API_TIMEOUT = 10000;

    // Services
    String DBPEDIA_SERVICE = "dbpedia";
    String DBPEDIA_RESOURCE_SERVICE = "dbpedia-resource";
    String DBPEDIA_SPARQL_SERVICE = "dbpedia-sparql";

    // Service Names
    String DBPEDIA = "DBpedia";
    String DBPEDIA_RESOURCE = "DBpedia Resource";
    String DBPEDIA_SPARQL = "DBpedia SPARQL";

    // Service Name, Endpoint URL, Mailing List, Mailing List URL
    HashMap<String, String[]> SERVICES = new HashMap<String, String[]>(){{
        put(DBPEDIA_SERVICE, new String[]{DBPEDIA, "http://wiki.dbpedia.org", "dbpedia-discussion@lists.sourceforge.net", "https://lists.sourceforge.net/lists/listinfo/dbpedia-discussion"});
        put(DBPEDIA_RESOURCE_SERVICE, new String[]{DBPEDIA_RESOURCE, "http://dbpedia.org/page/DBpedia", "dbpedia-discussion@lists.sourceforge.net", "https://lists.sourceforge.net/lists/listinfo/dbpedia-discussion"});
        put(DBPEDIA_SPARQL_SERVICE, new String[]{DBPEDIA_SPARQL, "http://dbpedia.org/sparql?default-graph-uri=http%3A%2F%2Fdbpedia.org&query=select+distinct+%3FConcept+where+%7B%5B%5D+a+%3FConcept%7D+LIMIT+100&format=text%2Fhtml&CXML_redir_for_subjs=121&CXML_redir_for_hrefs=&timeout=30000&debug=on", "dbpedia-discussion@lists.sourceforge.net", "https://lists.sourceforge.net/lists/listinfo/dbpedia-discussion"});
    }};

}

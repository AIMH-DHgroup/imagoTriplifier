
package cnr.isti.aimh.imago.pojo.full;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iri",
    "name",
    "abbreviation",
    "pages"
})
@Generated("jsonschema2pojo")
public class Source {

    @JsonProperty("iri")
    private String iri;
    @JsonProperty("name")
    private String name;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("pages")
    private String pages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iri")
    public String getIri() {
        return iri;
    }

    @JsonProperty("iri")
    public void setIri(String iri) {
        this.iri = iri;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("pages")
    public String getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(String pages) {
        this.pages = pages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

package es.sephire.cards.api.domain;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.apache.commons.lang.StringUtils.isEmpty;
import static org.apache.commons.lang.StringUtils.isNotBlank;

/**
 * A base entity for the model, with the common attributes almost all entities share.
 *
 * @author Loïc Prieto
 */
public class BaseEntity {
    /**
     * The identifier on the persistable storage.
     * Uniquely identifies the entity.
     */
    private Long id;
    /**
     * The name to display for the entity.
     * Prepared for i18n.
     */
    private Map<Locale, String> name;

    /**
     * A description for the entity.
     * Prepared for i18n.
     */
    private Map<Locale, String> description;

    public BaseEntity() {
        this.name = new HashMap<>();
        this.description = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Locale, String> getNames() {
        return name;
    }

    public void setNames(Map<Locale, String> name) {
        this.name = name;
    }

    /**
     * Adds an i18n name to the list.
     *
     * @param locale
     * @param name
     */
    public void setName(Locale locale, String name) {
        this.name.put(locale, name);
    }

    public String getName(Locale locale) {
        return this.name.get(locale);
    }

    /**
     * Adds an i18n description to the list.
     *
     * @param locale
     * @param name
     */
    public void setDescription(Locale locale, String description) {
        this.description.put(locale, description);
    }

    public String getDescription(Locale locale) {
        return this.description.get(locale);
    }

    public Map<Locale, String> getDescriptions() {
        return description;
    }

    public void setDescriptions(Map<Locale, String> description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass().getName()).append(" { \n")
                .append("    id: ").append(id).append("\n");
        if (this.name != null) {
            //Gets the english translation, or the first one available
            String i18nName = this.name.get(Locale.ENGLISH);
            if (isEmpty(i18nName)) {
                for (String nameItem : this.name.values()) {
                    i18nName = nameItem;
                    break;
                }
                if (isNotBlank(i18nName)) {
                    sb.append("    name: ").append(i18nName).append("\n");
                }
            } else {
                sb.append("    name: ").append(i18nName).append("\n");
            }
        }
        sb.append(" }");

        return sb.toString();
    }
}

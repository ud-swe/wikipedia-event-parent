package wikipedia.event.model;

import java.time.LocalDate;

/**
 * Class representing an event that occurred on a specific date.
 */
public class Event {

    /**
     * Date of the event.
     */
    private LocalDate date;

    /**
     * Description of the event.
     */
    private String description;

    /**
     * Constructor for creating an {@code Event} object.
     *
     * @param date        the date of the event
     * @param description the description of the event
     */
    public Event(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    /**
     * Returns the date of this event.
     *
     * @return the date of this event
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the date of this event.
     *
     * @param date the date of this event
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Returns the description of this event.
     *
     * @return the description of this event
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of this event.
     *
     * @param description the description of this event
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }    
        if (! (o instanceof Event)) {
            return false;
        }
        Event that = (Event) o;
        return java.util.Objects.equals(date, that.date) &&
                java.util.Objects.equals(description, that.description);
    }

    public int hashCode() {
        return java.util.Objects.hash(date, description);
    }

    /**
     * Returns the string representation of this event.
     *
     * @return the string representation of this event in the form
     * <span><em>date</em><code> - </code><em>description</em></span>
     */
    public String toString() {
        return String.format("%s - %s", date.toString(), description);
    }

}


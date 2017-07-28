package behavioral.memento;

/**
 * @author Renat Kaitmazov
 */

public final class Memento {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final String article;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Memento(String article) {
        this.article = article;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final String getSavedArticle() {
        return article;
    }
}

package behavioral.memento;

/**
 * @author Renat Kaitmazov
 */

public final class Originator {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private String article;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Originator(String article) {
        this.article = article;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void setArticle(String article) {
        this.article = article;
    }

    public final Memento saveState() {
        System.out.format("Saving \"%s\" to memento\n", article);
        return new Memento(article);
    }

    public final void restoreState(Memento memento) {
        final String restoredArticle = memento.getSavedArticle();
        System.out.printf("Restoring \"%s\" from memento\n", restoredArticle);
        this.article = restoredArticle;
    }
}

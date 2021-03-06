package es.guillermoorellana.punkapidroid.beers.presentation.entity;

import android.support.annotation.NonNull;

public class BeerEntry {
    private final int id;
    @NonNull
    private final String name;
    @NonNull
    private final String imageUrl;

    public BeerEntry(int id, @NonNull String name, @NonNull String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeerEntry beerEntry = (BeerEntry) o;

        if (id != beerEntry.id) return false;
        return name.equals(beerEntry.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}

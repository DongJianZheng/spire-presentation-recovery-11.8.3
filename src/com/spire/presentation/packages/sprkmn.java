/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprocaa;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public abstract class sprkmn
extends sprvjn
implements Cloneable {
    private sprwvn cfr_renamed_4;

    private /* synthetic */ sprwvn cfr_renamed_13756(sprkmn arg0) {
        int n;
        sprwvn sprwvn2 = new sprwvn();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            sprvjn sprvjn2 = ((sprvjn)this.cfr_renamed_4.get(n)).cfr_renamed_13616();
            int n3 = n++;
            sprvjn2.cfr_renamed_13692(arg0);
            sprwvn2.add(n3, sprvjn2);
            n2 = n;
        }
        return sprwvn2;
    }

    @sprtea
    public sprvjn cfr_renamed_13690(sprvjn arg0) {
        int n = this.cfr_renamed_13530(arg0);
        if (n < 1 || n > this.cfr_renamed_11861() - 1) {
            return null;
        }
        return this.cfr_renamed_576(n - 1);
    }

    public sprkmn() {
        sprkmn sprkmn2 = this;
        sprkmn2.cfr_renamed_4 = new sprwvn();
    }

    public void cfr_renamed_12148(int arg0) {
        if (0 > arg0 || arg0 >= this.cfr_renamed_4.size()) {
            throw new IllegalArgumentException(sprocaa.cfr_renamed_9("WVuVjRsRu\u0017iVjR=\u0017nYcR\u007f"));
        }
        this.cfr_renamed_4.remove(arg0);
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_4.clear();
    }

    public int cfr_renamed_12507(sprvjn arg0) {
        sprkmn sprkmn2 = this;
        arg0.cfr_renamed_13692(sprkmn2);
        return sprovja.cfr_renamed_11658(sprkmn2.cfr_renamed_4, arg0);
    }

    public sprvjn cfr_renamed_576(int arg0) {
        return (sprvjn)this.cfr_renamed_4.get(arg0);
    }

    public void cfr_renamed_13757(int arg0, sprvjn[] arg1) {
        int n;
        if (arg1.length == 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg1.length) {
            this.cfr_renamed_13531(arg0++, arg1[n++]);
            n2 = n;
        }
    }

    public sprkmn cfr_renamed_13686(boolean arg0) {
        sprkmn sprkmn2 = (sprkmn)this.cfr_renamed_12100();
        ((sprkmn)this.cfr_renamed_12100()).cfr_renamed_4 = arg0 ? this.cfr_renamed_13756(sprkmn2) : new sprwvn();
        return sprkmn2;
    }

    public void cfr_renamed_13758(int arg0, sprwvn arg1) {
        Iterator iterator;
        if (arg1.size() == 0) {
            return;
        }
        Iterator iterator2 = iterator = arg1.iterator();
        while (iterator2.hasNext()) {
            sprvjn sprvjn2 = (sprvjn)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_13531(arg0, sprvjn2);
            ++arg0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public void cfr_renamed_13531(int arg0, sprvjn arg1) {
        sprkmn sprkmn2 = this;
        arg1.cfr_renamed_13692(sprkmn2);
        sprkmn2.cfr_renamed_4.add(arg0, arg1);
    }

    public sprwvn cfr_renamed_8112() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprvjn cfr_renamed_13691(sprvjn arg0) {
        int n = this.cfr_renamed_13530(arg0);
        if (n < 0 || n > this.cfr_renamed_11861() - 2) {
            return null;
        }
        return this.cfr_renamed_576(n + 1);
    }

    public void cfr_renamed_13759(sprvjn[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_12507(arg0[n++]);
            n2 = n;
        }
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            Object object = this.cfr_renamed_4.get(n);
            ((sprvjn)object).cfr_renamed_13121(arg0);
            n2 = ++n;
        }
    }

    public int cfr_renamed_13530(sprvjn arg0) {
        return this.cfr_renamed_4.indexOf(arg0);
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        return this.cfr_renamed_13686(true);
    }

    public void cfr_renamed_13518(sprwvn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprvjn sprvjn2 = (sprvjn)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_12507(sprvjn2);
        }
    }
}


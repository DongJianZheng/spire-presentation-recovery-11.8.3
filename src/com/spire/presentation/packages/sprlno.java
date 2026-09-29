/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprmio;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpgo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtko;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxv;
import com.spire.presentation.packages.sprylo;
import java.util.Iterator;

@sprtea
public class sprlno {
    private sprdfo cfr_renamed_112;
    private sprtko cfr_renamed_119;
    private sprmio cfr_renamed_91;
    private sprwvn cfr_renamed_0;
    private sprioo cfr_renamed_1;
    private sprylo cfr_renamed_2;
    private spriy cfr_renamed_3;
    private sprjeka cfr_renamed_4;

    public sprioo cfr_renamed_16100() {
        return this.cfr_renamed_1;
    }

    public sprmio cfr_renamed_16408() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_16412(sprvjn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            ((sprxv)iterator.next()).cfr_renamed_16412(arg0);
            iterator2 = iterator;
        }
    }

    public spriy cfr_renamed_13400() {
        return this.cfr_renamed_3;
    }

    public sprtko cfr_renamed_16420() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_16134() {
        sprlno sprlno2 = this;
        sprpgo sprpgo2 = sprlno2.cfr_renamed_1.cfr_renamed_16317();
        sprlno2.cfr_renamed_4.cfr_renamed_12516(sprpgo2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16135() {
        if (this.cfr_renamed_4.size() == 0) {
            return;
        }
        sprpgo sprpgo2 = (sprpgo)this.cfr_renamed_4.cfr_renamed_12514();
        try {
            this.cfr_renamed_1.cfr_renamed_16367(sprpgo2);
            if (sprpgo2 == null) return;
            sprpgo2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprpgo2 == null) throw throwable;
            sprpgo2.cfr_renamed_11665();
            throw throwable;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlno(sprdfo sprdfo2, boolean bl, spriy spriy2) {
        sprlno sprlno2;
        void arg1;
        void arg2;
        void arg0;
        sprlno sprlno3 = this;
        sprlno sprlno4 = this;
        this.cfr_renamed_4 = new sprjeka();
        sprlno4.cfr_renamed_0 = new sprwvn();
        sprlno3.cfr_renamed_112 = arg0;
        sprlno3.cfr_renamed_3 = arg2;
        sprlno3.cfr_renamed_2 = new sprylo((boolean)arg1, (spriy)arg2);
        if (bl) {
            sprlno sprlno5 = this;
            sprlno2 = sprlno5;
            sprlno5.cfr_renamed_2.cfr_renamed_16277();
        } else {
            sprlno sprlno6 = this;
            sprlno2 = sprlno6;
            sprlno6.cfr_renamed_2.cfr_renamed_16279(arg0.cfr_renamed_16450());
        }
        sprlno2.cfr_renamed_1 = new sprioo(this.cfr_renamed_16153(), (sprdfo)arg0, (boolean)arg1, (spriy)arg2);
        this.cfr_renamed_91 = new sprmio(sprgeja.cfr_renamed_16235(arg0.cfr_renamed_16236()), this.cfr_renamed_1.cfr_renamed_12590(), this.cfr_renamed_1.cfr_renamed_16112());
        sprovja.cfr_renamed_11658(this.cfr_renamed_0, this.cfr_renamed_91);
    }

    public void cfr_renamed_16404(sprvjn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            ((sprxv)iterator.next()).cfr_renamed_16404(arg0);
            iterator2 = iterator;
        }
    }

    public void cfr_renamed_16425(sprvjn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            ((sprxv)iterator.next()).cfr_renamed_16425(arg0);
            iterator2 = iterator;
        }
    }

    public void cfr_renamed_16407() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            ((sprxv)iterator.next()).cfr_renamed_16407();
            iterator2 = iterator;
        }
    }

    public sprylo cfr_renamed_16153() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_11665() {
        sprlno sprlno2 = this;
        sprlno sprlno3 = sprlno2;
        sprlno2.cfr_renamed_1.cfr_renamed_11665();
        sprlno2.cfr_renamed_1 = null;
        while (sprlno3.cfr_renamed_4.size() > 0) {
            ((sprpgo)this.cfr_renamed_4.cfr_renamed_12514()).cfr_renamed_11665();
            sprlno3 = this;
        }
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_119.cfr_renamed_11665();
            this.cfr_renamed_119 = null;
        }
    }

    public void cfr_renamed_16421() {
        sprlno sprlno2 = this;
        sprlno sprlno3 = this;
        sprlno3.cfr_renamed_119 = new sprtko(sprgeja.cfr_renamed_16235(sprlno3.cfr_renamed_112.cfr_renamed_16236()), this.cfr_renamed_1.cfr_renamed_12590(), this.cfr_renamed_1.cfr_renamed_16112(), this.cfr_renamed_3);
        sprlno sprlno4 = this;
        sprlno3.cfr_renamed_119.cfr_renamed_16432(sprlno4.cfr_renamed_91.cfr_renamed_16203());
        sprovja.cfr_renamed_11658(sprlno4.cfr_renamed_0, this.cfr_renamed_119);
    }
}


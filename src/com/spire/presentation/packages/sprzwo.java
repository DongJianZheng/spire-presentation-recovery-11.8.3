/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.spruip;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprzwo {
    private sprrpp cfr_renamed_1;
    private sprivo cfr_renamed_2;
    private sprwvn cfr_renamed_3;
    private sprrpp cfr_renamed_4;

    public void cfr_renamed_18322(int arg0, sprivo arg1) {
        this.cfr_renamed_1.cfr_renamed_12962(arg0, arg1);
    }

    public Iterable cfr_renamed_15091() {
        return this.cfr_renamed_4.cfr_renamed_205();
    }

    public sprivo cfr_renamed_576(int arg0) {
        int n;
        sprivo sprivo2 = (sprivo)this.cfr_renamed_1.cfr_renamed_576(arg0);
        if (sprivo2 != null) {
            return sprivo2;
        }
        sprtvp sprtvp2 = this.cfr_renamed_18323(arg0);
        int n2 = n = 0;
        while (n2 < sprtvp2.cfr_renamed_11861()) {
            sprivo2 = (sprivo)this.cfr_renamed_1.cfr_renamed_576(sprtvp2.cfr_renamed_576(n));
            if (sprivo2 != null) {
                return sprivo2;
            }
            n2 = ++n;
        }
        return null;
    }

    public boolean cfr_renamed_18324(int arg0, boolean arg1) {
        sprivo sprivo2;
        sprivo sprivo3 = sprivo2 = arg1 ? this.cfr_renamed_576(arg0) : (sprivo)this.cfr_renamed_1.cfr_renamed_576(arg0);
        return sprivo2 != null;
    }

    @sprtea
    public void cfr_renamed_18325(sprwvn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public sprwvn cfr_renamed_18326() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprtvp cfr_renamed_18323(int arg0) {
        Iterator iterator;
        sprtvp sprtvp2 = new sprtvp();
        sprtvp2.cfr_renamed_12819(arg0);
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            ((spruip)iterator.next()).cfr_renamed_18327(sprtvp2);
            iterator2 = iterator;
        }
        return sprtvp2;
    }

    private /* synthetic */ sprivo cfr_renamed_18328() {
        sprivo sprivo2 = this.cfr_renamed_2;
        if (sprivo2 != null) {
            return sprivo2;
        }
        sprivo2 = this.cfr_renamed_576(32);
        if (sprivo2 != null) {
            return sprivo2;
        }
        throw new IllegalStateException(sprujha.cfr_renamed_9("\u0012w?x>bqp8x56066z(f967y#6%~8equ9w#w2b4dqu>r48"));
    }

    public void cfr_renamed_18329(sprivo arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_1.cfr_renamed_11861();
    }

    public sprrpp cfr_renamed_18330() {
        return this.cfr_renamed_4;
    }

    public sprivo cfr_renamed_13469(int arg0) {
        sprivo sprivo2 = this.cfr_renamed_576(arg0);
        if (sprivo2 != null) {
            return sprivo2;
        }
        return this.cfr_renamed_18328();
    }

    public sprzwo() {
        sprzwo sprzwo2 = this;
        this.cfr_renamed_1 = new sprrpp();
        sprzwo2.cfr_renamed_4 = new sprrpp();
        this.cfr_renamed_3 = new sprwvn();
    }

    public sprivo cfr_renamed_18331(int arg0) {
        return (sprivo)this.cfr_renamed_4.cfr_renamed_576(arg0);
    }

    public void cfr_renamed_825(int arg0, int arg1) {
        sprivo sprivo2;
        sprivo sprivo3 = sprivo2 = (sprivo)this.cfr_renamed_4.cfr_renamed_576(arg1);
        this.cfr_renamed_1.cfr_renamed_12962(arg0, sprivo3);
        if (!sprivo3.cfr_renamed_13079().cfr_renamed_18332(arg0)) {
            sprivo2.cfr_renamed_13079().cfr_renamed_12819(arg0);
        }
    }

    public sprivo cfr_renamed_15092() {
        return this.cfr_renamed_2;
    }

    public Iterable cfr_renamed_18333() {
        return this.cfr_renamed_1.cfr_renamed_205();
    }

    public sprrpp cfr_renamed_18334() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_18335(sprivo arg0) {
        this.cfr_renamed_4.cfr_renamed_12962(arg0.cfr_renamed_13076(), arg0);
    }

    public sprivo cfr_renamed_14372(int arg0) {
        sprivo sprivo2 = this.cfr_renamed_18331(arg0);
        if (sprivo2 == null) {
            return this.cfr_renamed_18328();
        }
        return sprivo2;
    }
}


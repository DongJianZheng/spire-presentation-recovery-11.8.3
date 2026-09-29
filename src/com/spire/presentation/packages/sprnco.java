/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprkgr;
import com.spire.presentation.packages.sprntga;
import com.spire.presentation.packages.sprnxga;
import com.spire.presentation.packages.sprqwq;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrol;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprslo;
import com.spire.presentation.packages.sprsuga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywq;
import java.util.Iterator;

@sprtea
public class sprnco {
    private sprsjo cfr_renamed_2;
    @sprtea
    public sprqwq cfr_renamed_3;
    @sprtea
    public sprnco cfr_renamed_4;

    @sprtea
    public String cfr_renamed_15495() {
        return sprraia.cfr_renamed_12806(this.cfr_renamed_15548());
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        return this.cfr_renamed_3.equals(((sprnco)arg0).cfr_renamed_3);
    }

    @sprtea
    public void cfr_renamed_15656(sprsjo arg0, String arg1) {
        this.cfr_renamed_3.cfr_renamed_15657(arg0.cfr_renamed_313(), arg0.cfr_renamed_15658().cfr_renamed_4651(), arg1);
    }

    @sprtea
    public int cfr_renamed_12271() {
        return this.cfr_renamed_3.cfr_renamed_12271();
    }

    @sprtea
    public sprnco cfr_renamed_15659(sprsjo arg0) {
        for (sprqwq sprqwq2 : this.cfr_renamed_3.cfr_renamed_12884()) {
            if (!sprraia.cfr_renamed_11730(sprqwq2.cfr_renamed_12286(), arg0.cfr_renamed_313()) || !sprraia.cfr_renamed_11730(sprqwq2.cfr_renamed_12284(), arg0.cfr_renamed_15658().cfr_renamed_4651()) && !"http://www.ofdspec.org".equals(sprqwq2.cfr_renamed_12284())) continue;
            return new sprnco(sprqwq2);
        }
        return null;
    }

    @sprtea
    public void cfr_renamed_15585(sprsjo arg0) {
        Object object;
        int n;
        sprnco sprnco2 = this;
        sprnco2.cfr_renamed_2 = arg0;
        sprqwq sprqwq2 = sprnco2.cfr_renamed_3.cfr_renamed_12322().createElement(arg0.cfr_renamed_15658().cfr_renamed_12281(), arg0.cfr_renamed_313(), arg0.cfr_renamed_15658().cfr_renamed_4651());
        sprnxga sprnxga2 = sprnco2.cfr_renamed_3.cfr_renamed_12884();
        int n2 = sprnxga2.cfr_renamed_11861();
        int n3 = n = 0;
        while (n3 < n2) {
            object = (sprqwq)sprnxga2.cfr_renamed_12320(n);
            sprqwq2.cfr_renamed_15318(((sprkgr)object).cfr_renamed_12099());
            n3 = ++n;
        }
        sprntga sprntga2 = this.cfr_renamed_3.cfr_renamed_82();
        Object object2 = object = sprntga2.iterator();
        while (object2.hasNext()) {
            sprsuga sprsuga2 = (sprsuga)object.next();
            object2 = object;
            sprqwq2.cfr_renamed_15660(sprsuga2.cfr_renamed_313(), sprsuga2.cfr_renamed_97());
        }
        object = this.cfr_renamed_3.cfr_renamed_15661();
        if (object != null) {
            ((sprkgr)object).cfr_renamed_15662(sprqwq2, this.cfr_renamed_3);
        }
        this.cfr_renamed_3 = sprqwq2;
    }

    @sprtea
    public void cfr_renamed_15281(sprsuga arg0) {
        this.cfr_renamed_3.cfr_renamed_15663(arg0);
    }

    @sprtea
    public void cfr_renamed_15489(String arg0) {
        this.cfr_renamed_3.cfr_renamed_12885(arg0);
    }

    @sprtea
    public sprnco(String arg0, sprslo arg1) {
        sprnco sprnco2 = this;
        sprnco2.cfr_renamed_3 = sprnco2.cfr_renamed_15664().createElement(arg1.cfr_renamed_12281(), arg0, arg1.cfr_renamed_4651());
        sprnco sprnco3 = this;
        sprnco2.cfr_renamed_2 = new sprsjo(this.cfr_renamed_3.cfr_renamed_313(), arg1);
    }

    @sprtea
    public sprnxga cfr_renamed_15665() {
        return this.cfr_renamed_3.cfr_renamed_12884();
    }

    @sprtea
    public sprsuga cfr_renamed_15666(int arg0) {
        return (sprsuga)this.cfr_renamed_3.cfr_renamed_82().cfr_renamed_12320(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_82() {
        Iterator iterator;
        sprntga sprntga2 = this.cfr_renamed_3.cfr_renamed_82();
        sprvrx<sprsuga> sprvrx2 = new sprvrx<sprsuga>(sprntga2.size());
        Iterator iterator2 = iterator = sprntga2.iterator();
        while (iterator2.hasNext()) {
            sprsuga sprsuga2 = (sprsuga)iterator.next();
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprsuga2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprdz cfr_renamed_15667(sprsjo arg0) {
        sprvrx<sprnco> sprvrx2 = new sprvrx<sprnco>();
        for (sprqwq sprqwq2 : this.cfr_renamed_3.cfr_renamed_12884()) {
            if (!sprraia.cfr_renamed_11730(sprqwq2.cfr_renamed_12286(), arg0.cfr_renamed_313()) || !sprraia.cfr_renamed_11730(sprqwq2.cfr_renamed_12284(), arg0.cfr_renamed_15658().cfr_renamed_4651()) && !"http://www.ofdspec.org".equals(sprqwq2.cfr_renamed_12284())) continue;
            sprvrx2.cfr_renamed_12808(new sprnco(sprqwq2));
        }
        return sprvrx2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprdz cfr_renamed_15477(String string) {
        void arg0;
        sprdz sprdz2 = this.cfr_renamed_15667(new sprsjo((String)arg0));
        if (sprdz2 == null || sprdz2.size() == 0) {
            return new sprvrx();
        }
        return sprdz2;
    }

    @sprtea
    public Object cfr_renamed_12099() {
        return new sprnco((sprqwq)this.cfr_renamed_3.cfr_renamed_12099());
    }

    public sprywq cfr_renamed_15664() {
        if (this.cfr_renamed_3 == null) {
            sprywq sprywq2 = sprilo.cfr_renamed_15664();
            return sprywq2;
        }
        sprywq sprywq3 = this.cfr_renamed_3.cfr_renamed_12322();
        return sprywq3;
    }

    @sprtea
    public void cfr_renamed_15668(sprqwq arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public sprsuga cfr_renamed_15669(sprsjo arg0) {
        return this.cfr_renamed_3.cfr_renamed_15670(arg0.cfr_renamed_313(), arg0.cfr_renamed_15658().cfr_renamed_4651());
    }

    @sprtea
    public void cfr_renamed_15671(String arg0, String arg1) {
        this.cfr_renamed_3.cfr_renamed_15660(arg0, arg1);
    }

    @sprtea
    public sprsuga cfr_renamed_15672(String arg0) {
        return (sprsuga)this.cfr_renamed_3.cfr_renamed_82().cfr_renamed_12311(arg0);
    }

    @sprtea
    public sprqwq cfr_renamed_15313() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public String cfr_renamed_15482(String arg0) {
        sprsuga sprsuga2 = (sprsuga)this.cfr_renamed_3.cfr_renamed_82().cfr_renamed_12311(arg0);
        if (sprsuga2 == null) {
            return null;
        }
        return sprsuga2.cfr_renamed_97();
    }

    @sprtea
    public boolean cfr_renamed_15673(sprkgr arg0) {
        return this.cfr_renamed_3.cfr_renamed_15316(arg0) != null;
    }

    @sprtea
    public void cfr_renamed_15271(sprnco arg0) {
        this.cfr_renamed_3.cfr_renamed_15318(arg0.cfr_renamed_3);
    }

    @sprtea
    public void cfr_renamed_15480(String arg0, String arg1) {
        this.cfr_renamed_3.cfr_renamed_15660(arg0, arg1);
    }

    @sprtea
    public sprsjo cfr_renamed_15674() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprdz<sprnco> cfr_renamed_15675(sprnxga arg0) {
        Iterator iterator;
        sprvrx<sprnco> sprvrx2 = new sprvrx<sprnco>(arg0.cfr_renamed_11861());
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprqwq sprqwq2 = (sprqwq)iterator.next();
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(new sprnco(sprqwq2));
        }
        return sprvrx2;
    }

    @sprtea
    public String cfr_renamed_15676(sprsjo arg0) {
        return this.cfr_renamed_3.cfr_renamed_15677(arg0.cfr_renamed_313(), arg0.cfr_renamed_15658().cfr_renamed_4651());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnco(sprnco sprnco2) {
        void arg0;
        if (sprnco2 == null) {
            throw new IllegalArgumentException(sprrol.cfr_renamed_9("jejdjg{)\u4e02\u80f4\u4e35\u7a73"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnco(sprqwq sprqwq2) {
        void arg0;
        if (sprqwq2 == null) {
            throw new IllegalArgumentException(sprebda.cfr_renamed_9("\u007f\u001c\u007f\u001d\u007f\u001enP\u4e17\u808d\u4e20\u7a0a"));
        }
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public String cfr_renamed_15548() {
        return this.cfr_renamed_3.cfr_renamed_12912();
    }

    @sprtea
    public void cfr_renamed_15678(sprkgr arg0) {
        this.cfr_renamed_3.cfr_renamed_15318(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public boolean cfr_renamed_15679(String arg0, String arg1) {
        sprsuga sprsuga2;
        sprqwq sprqwq2;
        Iterator iterator = this.cfr_renamed_15665().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return false;
                }
                sprqwq2 = (sprqwq)((sprkgr)iterator.next());
                if (sprqwq2 == null) continue block0;
                if (sprqwq2.cfr_renamed_15680()) break block0;
                iterator2 = iterator;
            }
            break;
        }
        sprntga sprntga2 = sprqwq2.cfr_renamed_82();
        if (sprntga2.cfr_renamed_12311(arg0) != null && arg0.equals((sprsuga2 = (sprsuga)sprntga2.cfr_renamed_12311(arg0)).cfr_renamed_12286())) {
            sprqwq2.cfr_renamed_12885(arg1);
        }
        return true;
    }

    @sprtea
    public sprdz cfr_renamed_15681(String arg0) {
        sprdz sprdz2 = this.cfr_renamed_15682(arg0);
        if (sprdz2 == null || sprdz2.size() == 0) {
            return new sprvrx();
        }
        return sprdz2;
    }

    @sprtea
    public sprdz cfr_renamed_15682(String arg0) {
        sprvrx<sprnco> sprvrx2 = new sprvrx<sprnco>();
        for (sprqwq sprqwq2 : this.cfr_renamed_3.cfr_renamed_12884()) {
            if (!sprraia.cfr_renamed_11730(sprqwq2.cfr_renamed_313(), arg0)) continue;
            sprvrx2.cfr_renamed_12808(new sprnco(sprqwq2));
        }
        return sprvrx2;
    }

    @sprtea
    public String cfr_renamed_313() {
        if (this.cfr_renamed_15674() == null) {
            return this.cfr_renamed_3.cfr_renamed_12286();
        }
        return this.cfr_renamed_15674().cfr_renamed_313();
    }

    @sprtea
    public String cfr_renamed_12284() {
        return this.cfr_renamed_15674().cfr_renamed_15658().cfr_renamed_4651();
    }

    @sprtea
    public boolean cfr_renamed_15683(sprsuga arg0) {
        return this.cfr_renamed_3.cfr_renamed_15684(arg0) != null;
    }

    @sprtea
    public String cfr_renamed_15685() {
        return this.cfr_renamed_15674().cfr_renamed_15658().cfr_renamed_12281();
    }

    @sprtea
    public sprdz<sprnco> cfr_renamed_2445() {
        sprnco sprnco2 = this;
        return sprnco2.cfr_renamed_15675(sprnco2.cfr_renamed_3.cfr_renamed_12884());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnco cfr_renamed_15494(String string) {
        void arg0;
        return this.cfr_renamed_15659(new sprsjo((String)arg0));
    }

    @sprtea
    public String cfr_renamed_15478() {
        sprsjo sprsjo2 = this.cfr_renamed_15674();
        if (sprsjo2 == null) {
            return this.cfr_renamed_3.cfr_renamed_313();
        }
        String string = sprsjo2.cfr_renamed_15658().cfr_renamed_12281();
        return new StringBuilder().insert(0, string).append(sprsjo2.cfr_renamed_313()).append(':').append(sprsjo2.cfr_renamed_313()).toString();
    }

    @sprtea
    public String cfr_renamed_13030() {
        return this.cfr_renamed_3.cfr_renamed_12912();
    }

    @sprtea
    public boolean cfr_renamed_15492(String arg0) {
        sprsuga sprsuga2 = (sprsuga)this.cfr_renamed_3.cfr_renamed_82().cfr_renamed_12311(arg0);
        if (sprsuga2 != null) {
            return this.cfr_renamed_15683(sprsuga2);
        }
        return false;
    }

    @sprtea
    public boolean cfr_renamed_15195(sprnco arg0) {
        return this.cfr_renamed_15673(arg0.cfr_renamed_3);
    }

    @sprtea
    public void cfr_renamed_15614(String arg0) {
        this.cfr_renamed_3.cfr_renamed_12885(new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_12912()).append(arg0).toString());
    }
}


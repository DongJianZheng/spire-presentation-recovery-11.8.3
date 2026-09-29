/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spreio;
import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxmo;
import java.util.Iterator;

@sprtea
public class sprrzn
extends sprnco {
    @Override
    @sprtea
    public sprdz cfr_renamed_15681(String arg0) {
        return this.cfr_renamed_15681(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprrzn cfr_renamed_15243(long l) {
        void arg0;
        return this.cfr_renamed_15279(new sprkjo((long)arg0));
    }

    @sprtea
    public sprrzn cfr_renamed_15279(sprkjo arg0) {
        sprrzn sprrzn2 = this;
        sprrzn2.cfr_renamed_15480("ID", arg0.toString());
        return sprrzn2;
    }

    @sprtea
    public sprkjo cfr_renamed_15537() {
        return sprkjo.cfr_renamed_141(this.cfr_renamed_15482("ID"));
    }

    @sprtea
    public sprrzn cfr_renamed_15623() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_2445().iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_15195(sprnco2);
        }
        return this;
    }

    @sprtea
    public sprrzn cfr_renamed_15555(sprnco arg0) {
        if (arg0 == null) {
            return this;
        }
        sprdz sprdz2 = this.cfr_renamed_15667(arg0.cfr_renamed_15674());
        if (sprdz2 != null && sprdz2.size() > 0) {
            Iterator iterator;
            Iterator iterator2 = iterator = sprdz2.iterator();
            while (iterator2.hasNext()) {
                sprnco sprnco2 = (sprnco)iterator.next();
                iterator2 = iterator;
                this.cfr_renamed_15195(sprnco2);
            }
        }
        sprrzn sprrzn2 = this;
        sprrzn2.cfr_renamed_15271(arg0);
        return sprrzn2;
    }

    @sprtea
    public static sprrzn cfr_renamed_141(String arg0) {
        return new sprrzn(arg0);
    }

    @sprtea
    public sprrzn(String arg0) {
        super(arg0, sprxmo.cfr_renamed_0);
    }

    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return this.cfr_renamed_3.cfr_renamed_313();
    }

    @Override
    @sprtea
    public sprdz cfr_renamed_15477(String arg0) {
        return super.cfr_renamed_15477(arg0);
    }

    @Override
    @sprtea
    public boolean cfr_renamed_15492(String arg0) {
        return super.cfr_renamed_15492(arg0);
    }

    @Override
    @sprtea
    public sprnco cfr_renamed_15494(String arg0) {
        return super.cfr_renamed_15494(arg0);
    }

    @sprtea
    public sprrzn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_15499(String arg0) {
        sprnco sprnco2 = this.cfr_renamed_15494(arg0);
        if (sprnco2 == null) {
            return null;
        }
        return sprnco2.cfr_renamed_13030();
    }

    @sprtea
    public sprdz cfr_renamed_15546(String ... arg0) {
        int n;
        sprvrx<sprnco> sprvrx2 = new sprvrx<sprnco>();
        if (arg0 == null) {
            return null;
        }
        String[] stringArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string = stringArray[n];
            if (!sprriia.cfr_renamed_15321(string, null) && sprraia.cfr_renamed_12806(string).length() != 0) {
                Iterator iterator = this.cfr_renamed_15477(string).iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    sprnco sprnco2 = (sprnco)iterator2.next();
                    if (sprnco2 == null) {
                        iterator = iterator2;
                        continue;
                    }
                    this.cfr_renamed_15673(sprnco2.cfr_renamed_3);
                    sprvrx2.cfr_renamed_12808(sprnco2);
                    iterator = iterator2;
                }
            }
            n3 = ++n;
        }
        return sprvrx2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprrzn cfr_renamed_15519(String string) {
        void arg0;
        sprrzn sprrzn2 = this;
        sprrzn2.cfr_renamed_15585(new sprsjo((String)arg0, sprxmo.cfr_renamed_0));
        return sprrzn2;
    }

    @sprtea
    public sprrzn cfr_renamed_15538(String arg0, Object arg1) {
        if (arg1 == null) {
            String[] stringArray = new String[1];
            stringArray[0] = arg0;
            this.cfr_renamed_15546(stringArray);
            return this;
        }
        sprnco sprnco2 = this.cfr_renamed_15494(arg0);
        if (sprnco2 == null) {
            return this.cfr_renamed_15421(arg0, arg1);
        }
        sprnco2.cfr_renamed_15489(arg1.toString());
        return this;
    }

    @sprtea
    public sprrzn cfr_renamed_15421(String arg0, Object arg1) {
        spreio spreio2 = new spreio(arg0, arg1);
        sprrzn sprrzn2 = this;
        sprrzn2.cfr_renamed_15678(sprrzn2.cfr_renamed_3.cfr_renamed_12322().cfr_renamed_15690(spreio2.cfr_renamed_3, true));
        return sprrzn2;
    }
}


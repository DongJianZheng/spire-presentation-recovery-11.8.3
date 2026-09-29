/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfp;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqio;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrol;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvio;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvvja;
import com.spire.presentation.packages.sprxqr;

@sprtea
public class sprcwn
extends sprrzn
implements sprfp {
    @sprtea
    public sprcwn cfr_renamed_15501(Double arg0) {
        if (arg0 == null) {
            sprcwn sprcwn2 = this;
            sprcwn2.cfr_renamed_15492(sprrol.cfr_renamed_9("P"));
            return sprcwn2;
        }
        sprcwn sprcwn3 = this;
        sprcwn3.cfr_renamed_15480(sprxqr.cfr_renamed_9("\t"), sprmgo.cfr_renamed_15502(arg0));
        return sprcwn3;
    }

    @sprtea
    public sprcwn cfr_renamed_15150(Double arg0, Double arg1) {
        return this.cfr_renamed_15503(arg0).cfr_renamed_15501(arg1);
    }

    @sprtea
    public String cfr_renamed_480() {
        return this.cfr_renamed_13030();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprcwn cfr_renamed_15504(double ... dArray) {
        void arg0;
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        return this.cfr_renamed_15151(new sprvio(objectArray));
    }

    @sprtea
    public sprcwn() {
        super(sprrol.cfr_renamed_9("[lw}Lfkl"));
    }

    @sprtea
    public Double cfr_renamed_1980() {
        String string = this.cfr_renamed_15482("X");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return sprmgo.cfr_renamed_15505(string);
    }

    @sprtea
    public sprvio cfr_renamed_15506() {
        String string = this.cfr_renamed_15482(sprxqr.cfr_renamed_9(")5\u0001$\f\t"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return sprvio.cfr_renamed_141(this.cfr_renamed_15507(string));
    }

    @sprtea
    public sprvio cfr_renamed_15508() {
        String string = this.cfr_renamed_15482(sprrol.cfr_renamed_9("Klc}nQ"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return sprvio.cfr_renamed_141(this.cfr_renamed_15507(string));
    }

    @sprtea
    public sprcwn cfr_renamed_15503(Double arg0) {
        if (arg0 == null) {
            sprcwn sprcwn2 = this;
            sprcwn2.cfr_renamed_15492("X");
            return sprcwn2;
        }
        sprcwn sprcwn3 = this;
        sprcwn3.cfr_renamed_15480("X", sprmgo.cfr_renamed_15502(arg0));
        return sprcwn3;
    }

    @sprtea
    public Double spr\u3181() {
        String string = this.cfr_renamed_15482(sprxqr.cfr_renamed_9("\t"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return sprmgo.cfr_renamed_15505(string);
    }

    @sprtea
    public sprcwn cfr_renamed_15158(String arg0) {
        sprcwn sprcwn2 = this;
        sprcwn2.cfr_renamed_15489(arg0);
        return sprcwn2;
    }

    @sprtea
    public sprcwn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprcwn cfr_renamed_15509(sprvio arg0) {
        if (arg0 == null) {
            sprcwn sprcwn2 = this;
            sprcwn2.cfr_renamed_15492(sprrol.cfr_renamed_9("Klc}nP"));
            return sprcwn2;
        }
        sprcwn sprcwn3 = this;
        sprcwn3.cfr_renamed_15480(sprxqr.cfr_renamed_9(")5\u0001$\f\t"), arg0.toString());
        return sprcwn3;
    }

    private /* synthetic */ String cfr_renamed_15507(String arg0) {
        Object object;
        if (!arg0.contains("g")) {
            return arg0;
        }
        sprvrx<String> sprvrx2 = new sprvrx<String>(sprvvja.cfr_renamed_15510(sprqio.cfr_renamed_15133(arg0, " ", true)));
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        sprvrx<Object> sprvrx3 = new sprvrx<Object>();
        Object object2 = sprvrx2.iterator();
        block0: while (true) {
            Object object3 = object2;
            while (object3.hasNext()) {
                object = (String)object2.next();
                if ("g".equals(object)) {
                    bl = true;
                    continue block0;
                }
                if (sprriia.cfr_renamed_15321(object, null)) continue block0;
                if (sprraia.cfr_renamed_12806((String)object).length() == 0) {
                    object3 = object2;
                    continue;
                }
                if (bl) {
                    n = Integer.parseInt((String)object);
                    bl2 = true;
                    bl = false;
                    continue block0;
                }
                if (bl2) {
                    int n2;
                    int n3 = n2 = 0;
                    while (n3 < n) {
                        sprvrx3.cfr_renamed_12808(object);
                        n3 = ++n2;
                    }
                    bl2 = false;
                    continue block0;
                }
                sprvrx3.cfr_renamed_12808(object);
                continue block0;
            }
            break;
        }
        object2 = new StringBuilder();
        Object object4 = object = sprvrx3.iterator();
        while (object4.hasNext()) {
            String string = (String)object.next();
            object4 = object;
            sprghha.cfr_renamed_12279(((StringBuilder)object2).append(' '), string);
        }
        return sprraia.cfr_renamed_12806(((StringBuilder)object2).toString());
    }

    @sprtea
    public sprcwn cfr_renamed_15151(sprvio arg0) {
        if (arg0 == null) {
            sprcwn sprcwn2 = this;
            sprcwn2.cfr_renamed_15492(sprrol.cfr_renamed_9("Klc}nQ"));
            return sprcwn2;
        }
        sprcwn sprcwn3 = this;
        sprcwn3.cfr_renamed_15480(sprxqr.cfr_renamed_9(")5\u0001$\f\b"), arg0.toString());
        return sprcwn3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprcwn cfr_renamed_15511(double ... dArray) {
        void arg0;
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        return this.cfr_renamed_15509(new sprvio(objectArray));
    }
}


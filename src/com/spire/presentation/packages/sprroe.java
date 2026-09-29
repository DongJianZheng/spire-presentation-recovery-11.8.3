/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.spreqea;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmdm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.spryoe;
import com.spire.presentation.packages.sprypl;
import java.util.ArrayList;
import java.util.List;

public class sprroe {
    private String cfr_renamed_91;
    public static final String cfr_renamed_0 = "1.3.6.1.4.1.8005.100.100.4";
    private List cfr_renamed_1;
    private List cfr_renamed_2;
    private sprypl cfr_renamed_3;
    private String cfr_renamed_4;

    public List cfr_renamed_418() {
        return this.cfr_renamed_1;
    }

    public List cfr_renamed_420() {
        return this.cfr_renamed_2;
    }

    public sprypl cfr_renamed_419() {
        return this.cfr_renamed_3;
    }

    public String toString() {
        return new StringBuilder().insert(0, spreqea.cfr_renamed_9("{d\r\u000b\r\u000b\r\u000b\u0017")).append(this.cfr_renamed_91).append("\n").append(sprbtm.cfr_renamed_9("-;\u0016 5;\u0017 _")).append(this.cfr_renamed_4).append("\n").append(spreqea.cfr_renamed_9("kzle^\u000b\r\u000b\u0017")).append(this.cfr_renamed_2).toString();
    }

    public String cfr_renamed_421() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprroe(sprypl sprypl2) {
        void arg0;
        sprroe sprroe2 = this;
        this.cfr_renamed_1 = new ArrayList();
        sprroe2.cfr_renamed_2 = new ArrayList();
        if (sprypl2 == null) {
            throw new IllegalArgumentException(sprbtm.cfr_renamed_9("3\u001b(\u0007$ \u0011&\f6\u0010 \u0000nE\u0015\u0011 \u0017=\u0007!\u00111&1\u0017 \f2\f7\u0004 \u0000t\f'E\u001a0\u0018)"));
        }
        this.cfr_renamed_3 = arg0;
        sprujm[] sprujmArray = arg0.cfr_renamed_5109(new sprlem(cfr_renamed_0));
        if (sprujmArray == null) {
            return;
        }
        try {
            for (int i = 0; i != sprujmArray.length; ++i) {
                int n;
                sprmdm sprmdm2 = sprmdm.cfr_renamed_23(sprujmArray[i].cfr_renamed_4528()[0]);
                String string = ((sprupm)sprmdm2.cfr_renamed_422().cfr_renamed_289()[0].cfr_renamed_313()).cfr_renamed_314();
                int n2 = string.indexOf("://");
                if (n2 < 0 || n2 == string.length() - 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, spreqea.cfr_renamed_9("iLO\rNCHBODEJ\u000bBM\r}bf~\u000b]DABNRl^YCBYD_T\u000b\u0017\u000bv")).append(string).append("]").toString());
                }
                String string2 = string;
                this.cfr_renamed_91 = string2.substring(0, n2);
                this.cfr_renamed_4 = string2.substring(n2 + 3);
                if (sprmdm2.cfr_renamed_423() != 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprbtm.cfr_renamed_9("\u0002*\u00196t\u0004 \u0011&\f6\u0010 \u0000t\u00135\t!\u0000'E5\u00171E:\n E1\u000b7\n0\u00000E5\u0016t\n7\u00111\u0011t\u0016 \u0017=\u000b3\u0016xE$\n8\f7\u001c\u0015\u0010 \r;\u0017=\u0011-EiE")).append(string).toString());
                }
                sproug[] sprougArray = (sproug[])sprmdm2.cfr_renamed_205();
                int n3 = n = 0;
                while (n3 != sprougArray.length) {
                    String string3 = new String(sprougArray[n].cfr_renamed_186());
                    spryoe spryoe2 = new spryoe(string3);
                    if (!this.cfr_renamed_1.contains(string3) && string3.startsWith(new StringBuilder().insert(0, "/").append(this.cfr_renamed_91).append("/").toString())) {
                        this.cfr_renamed_1.add(string3);
                        this.cfr_renamed_2.add(spryoe2);
                    }
                    n3 = ++n;
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spreqea.cfr_renamed_9("oJIGT\u000bHENDINI\u000b{d`x\rNU_HE^BBE\rBC\u000blh\rB^XXNI\u000bOR\r")).append(arg0.cfr_renamed_102()).toString());
        }
    }

    public String cfr_renamed_417() {
        return this.cfr_renamed_4;
    }
}


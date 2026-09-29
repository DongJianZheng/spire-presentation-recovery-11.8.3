/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawa;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.spriie;
import com.spire.presentation.packages.sprmsa;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprz;
import java.util.ArrayList;
import java.util.List;

public class sprysa {
    private sprz cfr_renamed_91;
    private String cfr_renamed_0;
    private String cfr_renamed_1;
    private List cfr_renamed_2;
    private List cfr_renamed_3;
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8005.100.100.4";

    public String cfr_renamed_417() {
        return this.cfr_renamed_1;
    }

    public List cfr_renamed_418() {
        return this.cfr_renamed_3;
    }

    public sprz cfr_renamed_419() {
        return this.cfr_renamed_91;
    }

    public List cfr_renamed_420() {
        return this.cfr_renamed_2;
    }

    public String cfr_renamed_421() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprysa(sprz sprz2) {
        void arg0;
        sprysa sprysa2 = this;
        this.cfr_renamed_3 = new ArrayList();
        sprysa2.cfr_renamed_2 = new ArrayList();
        if (sprz2 == null) {
            throw new IllegalArgumentException(sprfap.cfr_renamed_9("b|y`uG@A]QAGQ\t\u0014r@GFZVF@VwVFG]U]PUGQ\u0013]@\u0014}a\u007fx"));
        }
        this.cfr_renamed_91 = arg0;
        sprawa[] sprawaArray = arg0.cfr_renamed_112(cfr_renamed_4);
        if (sprawaArray == null) {
            return;
        }
        try {
            for (int i = 0; i != sprawaArray.length; ++i) {
                int n;
                spriie spriie2 = spriie.cfr_renamed_23(sprawaArray[i].cfr_renamed_205()[0]);
                String string = ((sprcae)spriie2.cfr_renamed_422().cfr_renamed_289()[0].cfr_renamed_313()).cfr_renamed_314();
                int n2 = string.indexOf("://");
                if (n2 < 0 || n2 == string.length() - 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprtma.cfr_renamed_9("O;izh4n5i3c=-5kz[\u0015@\t-*b6d9t\u001bx.e5\u007f3y#-`-\u0001")).append(string).append("]").toString());
                }
                String string2 = string;
                this.cfr_renamed_0 = string2.substring(0, n2);
                this.cfr_renamed_1 = string2.substring(n2 + 3);
                if (spriie2.cfr_renamed_423() != 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprfap.cfr_renamed_9("e{~g\u0013UG@A]QAGQ\u0013BRXFQ@\u0014RFV\u0014][G\u0014VZP[WQW\u0014RG\u0013[P@V@\u0013GGFZZTG\u001f\u0014C[_]PMrAG\\\\FZ@J\u0014\u000e\u0014")).append(string).toString());
                }
                sprxue[] sprxueArray = (sprxue[])spriie2.cfr_renamed_205();
                int n3 = n = 0;
                while (n3 != sprxueArray.length) {
                    String string3 = new String(sprxueArray[n].cfr_renamed_186());
                    sprmsa sprmsa2 = new sprmsa(this, string3);
                    if (!this.cfr_renamed_3.contains(string3) && string3.startsWith(new StringBuilder().insert(0, "/").append(this.cfr_renamed_0).append("/").toString())) {
                        this.cfr_renamed_3.add(string3);
                        this.cfr_renamed_2.add(sprmsa2);
                    }
                    n3 = ++n;
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtma.cfr_renamed_9("\u0018l>a#-?c9b>h>-\fB\u0017^zh\"y?c)d5czd4-\u001bNzd)~/h>-8tz")).append(arg0.cfr_renamed_102()).toString());
        }
    }

    public String toString() {
        return new StringBuilder().insert(0, sprfap.cfr_renamed_9("b|\u0014\u0013\u0014\u0013\u0014\u0013\u000e")).append(this.cfr_renamed_0).append("\n").append(sprtma.cfr_renamed_9("\u0012b)y\nb(y`")).append(this.cfr_renamed_1).append("\n").append(sprfap.cfr_renamed_9("rbu}G\u0013\u0014\u0013\u000e")).append(this.cfr_renamed_2).toString();
    }
}


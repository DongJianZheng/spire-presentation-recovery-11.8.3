/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmhe;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqge;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class spruhe
extends sprkra
implements sprkj {
    private boolean cfr_renamed_0;
    private int cfr_renamed_1;
    private sprok cfr_renamed_2;
    private static sprok cfr_renamed_3 = sprmhe.cfr_renamed_84;
    private sprnke[] cfr_renamed_4;

    public spruhe(String arg0) {
        this(cfr_renamed_3, arg0);
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spruhe) && !(arg0 instanceof sprbne)) {
            return false;
        }
        sprvva sprvva2 = ((spra)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().equals(sprvva2)) {
            return true;
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_3220(this, new spruhe(sprbne.cfr_renamed_23(((spra)arg0).cfr_renamed_119())));
        }
        catch (Exception exception) {
            return false;
        }
    }

    public sprnke[] cfr_renamed_4538(sprtzd arg0) {
        int n;
        sprnke[] sprnkeArray = new sprnke[this.cfr_renamed_4.length];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_4.length) {
            sprnke sprnke2 = this.cfr_renamed_4[n];
            if (sprnke2.cfr_renamed_4539()) {
                int n4;
                sprqge[] sprqgeArray = sprnke2.cfr_renamed_4540();
                int n5 = n4 = 0;
                while (n5 != sprqgeArray.length) {
                    if (sprqgeArray[n4].cfr_renamed_324().equals(arg0)) {
                        sprnkeArray[n2++] = sprnke2;
                        break;
                    }
                    n5 = ++n4;
                }
            } else if (sprnke2.cfr_renamed_4541().cfr_renamed_324().equals(arg0)) {
                sprnkeArray[n2++] = sprnke2;
            }
            n3 = ++n;
        }
        sprnke[] sprnkeArray2 = new sprnke[n2];
        System.arraycopy(sprnkeArray, 0, sprnkeArray2, 0, sprnkeArray2.length);
        return sprnkeArray2;
    }

    /*
     * WARNING - void declaration
     */
    public spruhe(sprok sprok2, sprnke[] sprnkeArray) {
        void arg1;
        spruhe spruhe2 = this;
        spruhe2.cfr_renamed_4 = arg1;
        spruhe2.cfr_renamed_2 = sprok2;
    }

    public sprtzd[] cfr_renamed_4542() {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 != this.cfr_renamed_4.length) {
            sprnke sprnke2 = this.cfr_renamed_4[n2];
            n3 += sprnke2.cfr_renamed_84();
            n4 = ++n2;
        }
        sprtzd[] sprtzdArray = new sprtzd[n3];
        n3 = 0;
        int n5 = n = 0;
        while (n5 != this.cfr_renamed_4.length) {
            sprnke sprnke3 = this.cfr_renamed_4[n];
            if (sprnke3.cfr_renamed_4539()) {
                int n6;
                sprqge[] sprqgeArray = sprnke3.cfr_renamed_4540();
                int n7 = n6 = 0;
                while (n7 != sprqgeArray.length) {
                    int n8 = n3++;
                    sprtzd sprtzd2 = sprqgeArray[n6].cfr_renamed_324();
                    sprtzdArray[n8] = sprtzd2;
                    n7 = ++n6;
                }
            } else if (sprnke3.cfr_renamed_84() != 0) {
                sprtzdArray[n3++] = sprnke3.cfr_renamed_4541().cfr_renamed_324();
            }
            n5 = ++n;
        }
        return sprtzdArray;
    }

    public spruhe(sprnke[] arg0) {
        this(cfr_renamed_3, arg0);
    }

    public static spruhe cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruhe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, true));
    }

    public static spruhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruhe) {
            return (spruhe)arg0;
        }
        if (arg0 != null) {
            return new spruhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruhe(sprok sprok2, sprbne sprbne2) {
        void arg1;
        Enumeration enumeration;
        void arg0;
        spruhe spruhe2 = this;
        spruhe2.cfr_renamed_2 = arg0;
        spruhe2.cfr_renamed_4 = new sprnke[sprbne2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = arg1.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_4[++n] = sprnke.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    public static spruhe cfr_renamed_2150(sprok arg0, Object arg1) {
        if (arg1 instanceof spruhe) {
            return spruhe.cfr_renamed_2150(arg0, ((spruhe)arg1).cfr_renamed_119());
        }
        if (arg1 != null) {
            return new spruhe(arg0, sprbne.cfr_renamed_23(arg1));
        }
        return null;
    }

    public static void cfr_renamed_4543(sprok arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprtsn.cfr_renamed_9("T{YtXn\u0017iRn\u0017iCc[\u007f\u0017nX:Yo[v"));
        }
        cfr_renamed_3 = arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprpse(this.cfr_renamed_4);
    }

    private /* synthetic */ spruhe(sprbne arg0) {
        this(cfr_renamed_3, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruhe(sprok sprok2, spruhe spruhe2) {
        void arg1;
        spruhe spruhe3 = this;
        spruhe3.cfr_renamed_4 = arg1.cfr_renamed_4;
        spruhe3.cfr_renamed_2 = sprok2;
    }

    public String toString() {
        return this.cfr_renamed_2.cfr_renamed_4530(this);
    }

    public static sprok cfr_renamed_4328() {
        return cfr_renamed_3;
    }

    public sprnke[] cfr_renamed_4544() {
        sprnke[] sprnkeArray = new sprnke[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, sprnkeArray, 0, sprnkeArray.length);
        return sprnkeArray;
    }

    @Override
    public int hashCode() {
        if (this.cfr_renamed_0) {
            return this.cfr_renamed_1;
        }
        spruhe spruhe2 = this;
        spruhe2.cfr_renamed_0 = true;
        this.cfr_renamed_1 = spruhe2.cfr_renamed_2.cfr_renamed_2415(this);
        return spruhe2.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spruhe(sprok sprok2, String string) {
        this(arg0.cfr_renamed_3246((String)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_2 = sprok2;
    }
}


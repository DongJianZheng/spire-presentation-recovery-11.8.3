/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasg;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqee;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;

public class sprdhe
extends sprkra {
    public static final int cfr_renamed_91 = 1;
    private int cfr_renamed_0;
    public sprnhe cfr_renamed_1;
    public spryee cfr_renamed_2;
    public sprqee cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    /*
     * WARNING - void declaration
     */
    public sprdhe(spryee spryee2, int n) {
        void arg0;
        sprdhe sprdhe2 = this;
        this.cfr_renamed_0 = 1;
        sprdhe2.cfr_renamed_2 = arg0;
        sprdhe2.cfr_renamed_0 = n;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprdhe(sprbne sprbne2) {
        int n;
        void arg0;
        this.cfr_renamed_0 = 1;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnez.cfr_renamed_9("!*\u0007k\u0010.\u0012>\u0006%\u0000.C8\n1\u0006qC")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = n = 0;
        while (true) {
            if (n2 == arg0.cfr_renamed_84()) {
                this.cfr_renamed_0 = 1;
                return;
            }
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_1 = sprnhe.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_2 = spryee.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_3 = sprqee.cfr_renamed_341(spryte2, false);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprasg.cfr_renamed_9("UTKTOMN\u001aT[G\u001aIT\u0000rOVD_R"));
                }
            }
            n2 = ++n;
        }
    }

    public sprdhe(sprqee sprqee2) {
        sprdhe sprdhe2 = this;
        sprdhe2.cfr_renamed_0 = 1;
        sprdhe2.cfr_renamed_3 = sprqee2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdhe(spryte spryte2) {
        this.cfr_renamed_0 = 1;
        switch (spryte2.cfr_renamed_312()) {
            case 0: {
                void arg0;
                while (false) {
                }
                sprdhe sprdhe2 = this;
                this.cfr_renamed_1 = sprnhe.cfr_renamed_341((spryte)arg0, true);
                break;
            }
            case 1: {
                void arg0;
                sprdhe sprdhe2 = this;
                this.cfr_renamed_2 = spryee.cfr_renamed_341((spryte)arg0, true);
                break;
            }
            default: {
                throw new IllegalArgumentException(sprnez.cfr_renamed_9("\u0016%\b%\f<\rk\u0017*\u0004k\n%C\u0003\f'\u0007.\u0011"));
            }
        }
        sprdhe2.cfr_renamed_0 = 0;
    }

    public spryee cfr_renamed_407() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprdhe(sprnhe sprnhe2, int n) {
        void arg0;
        sprdhe sprdhe2 = this;
        this.cfr_renamed_0 = 1;
        sprdhe2.cfr_renamed_1 = arg0;
        sprdhe2.cfr_renamed_0 = n;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_0;
    }

    public sprdhe(spryee arg0) {
        this(arg0, 1);
    }

    public sprnhe cfr_renamed_404() {
        return this.cfr_renamed_1;
    }

    public sprdhe(sprnhe arg0) {
        this(arg0, 1);
    }

    public sprqee cfr_renamed_409() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_0 == 1) {
            sprlre sprlre2 = new sprlre();
            if (this.cfr_renamed_1 != null) {
                sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_1));
            }
            if (this.cfr_renamed_2 != null) {
                sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_2));
            }
            if (this.cfr_renamed_3 != null) {
                sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_3));
            }
            return new sprpse(sprlre2);
        }
        if (this.cfr_renamed_2 != null) {
            return new sprhse(1 != 0, 1, this.cfr_renamed_2);
        }
        return new sprhse(true, 0, this.cfr_renamed_1);
    }

    public static sprdhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdhe) {
            return (sprdhe)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprdhe(spryte.cfr_renamed_23(arg0));
        }
        if (arg0 != null) {
            return new sprdhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


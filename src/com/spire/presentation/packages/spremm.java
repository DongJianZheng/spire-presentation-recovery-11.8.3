/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjdz;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprndn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryym;
import com.spire.presentation.packages.sprzqm;
import java.io.IOException;

public class spremm
extends sprqqe
implements sprlm {
    private final sprndn cfr_renamed_2;
    private final sprbrm cfr_renamed_3;
    private final sprzqm cfr_renamed_4;

    public spremm(sprzqm arg0) {
        this(null, arg0, null);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_119();
        }
        return this.cfr_renamed_3.cfr_renamed_119();
    }

    public spremm(sprbrm arg0) {
        this(null, null, arg0);
    }

    public static spremm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spremm) {
            return (spremm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprktm) {
                return new spremm(sprndn.cfr_renamed_23(sprxgf2));
            }
            if (sprxgf2 instanceof sprszm) {
                if (((sprszm)sprxgf2).cfr_renamed_85(0) instanceof sprlem) {
                    return new spremm(sprbrm.cfr_renamed_23(sprxgf2));
                }
                return new spremm(sprzqm.cfr_renamed_23(sprxgf2));
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return spremm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spryym.cfr_renamed_9("\u0005f\u0007t\u001ci\u0012'\u0010u\u0007h\u0007=U")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjdz.cfr_renamed_9("mpspwiv>w|r{{j8wv>\u007f{lWvml\u007fv}}61$8")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_11385() {
        return this.cfr_renamed_2 != null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spremm(sprndn sprndn2, sprzqm sprzqm2, sprbrm sprbrm2) {
        void arg1;
        void arg0;
        spremm spremm2 = this;
        this.cfr_renamed_2 = arg0;
        spremm2.cfr_renamed_4 = arg1;
        spremm2.cfr_renamed_3 = sprbrm2;
    }

    public spremm(sprndn arg0) {
        this(arg0, null, null);
    }

    public boolean cfr_renamed_11386() {
        return this.cfr_renamed_3 != null;
    }

    public boolean cfr_renamed_11387() {
        return this.cfr_renamed_4 != null;
    }
}


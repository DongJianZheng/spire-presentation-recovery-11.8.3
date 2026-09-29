/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqih;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.AccessController;

public class sprzdh
extends sprqqe {
    private final byte[] cfr_renamed_4;

    public static sprzdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzdh) {
            return (sprzdh)arg0;
        }
        if (arg0 != null) {
            return new sprzdh(sproug.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static <T> T cfr_renamed_8285(Class<T> arg0, sprvlh arg1, sprzdh arg2) {
        return AccessController.doPrivileged(new sprqih(arg2, arg1, arg0));
    }

    public InputStream cfr_renamed_2920() {
        return new ByteArrayInputStream(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprfvg(this.cfr_renamed_4);
    }

    public static /* synthetic */ byte[] cfr_renamed_8286(sprzdh arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprzdh(byte[] byArray) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    private /* synthetic */ sprzdh(sproug arg0) {
        this(arg0.cfr_renamed_186());
    }

    public byte[] cfr_renamed_480() {
        return this.cfr_renamed_4;
    }
}


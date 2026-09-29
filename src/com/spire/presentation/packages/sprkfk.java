/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.spropk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprkfk
extends IOException {
    private InputStream cfr_renamed_1;
    private int cfr_renamed_2;
    private static final long cfr_renamed_3 = 8192L;
    private Throwable cfr_renamed_4;

    public sprkfk(String arg0) {
        this(arg0, null);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkfk(String string, Throwable throwable, int n, InputStream inputStream) {
        void arg2;
        void arg1;
        void arg0;
        sprkfk sprkfk2 = this;
        super((String)arg0);
        sprkfk2.cfr_renamed_4 = arg1;
        sprkfk2.cfr_renamed_2 = arg2;
        if (inputStream != null) {
            byte[] byArray = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream2;
                void arg3;
                block5: {
                    int n2;
                    int n3 = n2 = arg3.read(byArray);
                    while (n3 >= 0) {
                        if ((long)(byteArrayOutputStream.size() + n2) > 8192L) {
                            n2 = 8192 - byteArrayOutputStream.size();
                            ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                            byteArrayOutputStream2 = byteArrayOutputStream3;
                            byteArrayOutputStream3.write(byArray, 0, n2);
                            break block5;
                        }
                        byteArrayOutputStream.write(byArray, 0, n2);
                        n3 = arg3.read(byArray);
                    }
                    byteArrayOutputStream2 = byteArrayOutputStream;
                }
                byteArrayOutputStream2.flush();
                byteArrayOutputStream.close();
                sprkfk sprkfk3 = this;
                sprkfk3.cfr_renamed_1 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                arg3.close();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        this.cfr_renamed_1 = null;
    }

    public int cfr_renamed_9732() {
        return this.cfr_renamed_2;
    }

    @Override
    public String getMessage() {
        return new StringBuilder().insert(0, super.getMessage()).append(sprfvo.cfr_renamed_9("\r4y(}\\~\bL\bX\u000f\r?B\u0018HF\r")).append(this.cfr_renamed_2).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprkfk(String string, Throwable throwable) {
        void arg1;
        void arg0;
        sprkfk sprkfk2 = this;
        super((String)arg0);
        this.cfr_renamed_4 = arg1;
        sprkfk2.cfr_renamed_1 = null;
        sprkfk2.cfr_renamed_2 = 0;
    }

    public InputStream cfr_renamed_2573() {
        if (this.cfr_renamed_1 == null) {
            return new spropk(this);
        }
        return this.cfr_renamed_1;
    }
}


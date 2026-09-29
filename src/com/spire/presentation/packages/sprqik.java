/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwtz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@sprtea
public class sprqik {
    private final ByteBuffer cfr_renamed_4;

    public void cfr_renamed_9667(int arg0) {
        if (arg0 > this.cfr_renamed_9665()) {
            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("j<c090a6|0}&97l3\u007f0kuk0t4p;p;~"));
        }
        while (--arg0 >= 0) {
            this.cfr_renamed_4.get();
        }
    }

    public byte[] cfr_renamed_9658(int arg0, int arg1) {
        if (arg1 - arg0 < 0 || arg0 < 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("\fz\u0013u\t}\u00014\u0017u\u000bs\u00004")).append(arg0).append(":").append(arg1).toString());
        }
        if (arg1 > this.cfr_renamed_4.limit()) {
            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("'x;~090a6|0}&97l3\u007f0kuk0t4p;p;~"));
        }
        sprqik sprqik2 = this;
        int n = sprqik2.cfr_renamed_4.position();
        sprqik2.cfr_renamed_4.position(arg0);
        byte[] byArray = new byte[arg1 - arg0];
        this.cfr_renamed_4.get(byArray);
        this.cfr_renamed_4.position(n);
        return byArray;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.limit() - 20;
    }

    @sprtea
    public static sprqik cfr_renamed_9654(Object arg0) throws IOException {
        if (arg0 == null) {
            return null;
        }
        if (arg0 instanceof sprqik) {
            return (sprqik)arg0;
        }
        if (arg0 instanceof ByteBuffer) {
            return new sprqik((ByteBuffer)arg0);
        }
        if (arg0 instanceof byte[]) {
            return sprqik.cfr_renamed_9654(ByteBuffer.wrap((byte[])arg0));
        }
        if (arg0 instanceof ByteArrayOutputStream) {
            return sprqik.cfr_renamed_9654(((ByteArrayOutputStream)arg0).toByteArray());
        }
        if (arg0 instanceof InputStream) {
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byArray = new byte[4096];
            Object object = arg0;
            while ((n = ((InputStream)object).read(byArray)) >= 0) {
                object = arg0;
                byteArrayOutputStream.write(byArray, 0, n);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream2.flush();
            byteArrayOutputStream2.close();
            return sprqik.cfr_renamed_9654(byteArrayOutputStream2);
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("&{\u0010x\u00014\u000b{\u00114\u0006{\u000bb\u0000f\u00114")).append(arg0.getClass().getCanonicalName()).append(sprbcca.cfr_renamed_9("um:9\u001e|,[:a\u0017`!|\u0017l3\u007f0k")).toString());
    }

    public byte[] cfr_renamed_9664(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprwtz.cfr_renamed_9("\u0016}\u001fqEx\u0000g\u00164\u0011|\u0004zE$"));
        }
        if (arg0 > this.cfr_renamed_9665()) {
            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("j<c090a6|0}&97l3\u007f0kuk0t4p;p;~"));
        }
        byte[] byArray = new byte[arg0];
        this.cfr_renamed_4.get(byArray);
        return byArray;
    }

    public void cfr_renamed_9670(int arg0) {
        this.cfr_renamed_4.position(arg0);
    }

    public boolean cfr_renamed_9671() {
        return this.cfr_renamed_4.hasRemaining();
    }

    public int cfr_renamed_9657() {
        return this.cfr_renamed_4.get() & 0xFF;
    }

    public int cfr_renamed_9666() {
        return this.cfr_renamed_4.position();
    }

    public int cfr_renamed_9665() {
        return this.cfr_renamed_4.remaining();
    }

    public ByteBuffer cfr_renamed_3461() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_9656() {
        return this.cfr_renamed_9657() << 8 | this.cfr_renamed_9657();
    }

    public long cfr_renamed_9655() {
        return this.cfr_renamed_9657() << 24 | this.cfr_renamed_9657() << 16 | this.cfr_renamed_9657() << 8 | this.cfr_renamed_9657();
    }

    public sprqik(ByteBuffer byteBuffer) {
        this.cfr_renamed_4 = byteBuffer;
    }
}


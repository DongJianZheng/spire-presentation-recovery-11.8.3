/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.sprjig;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlk;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprqxf;
import com.spire.presentation.packages.sprrbfa;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprtzf;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprxag;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

public class spriyf
extends sprodg
implements sprlk {
    private final int cfr_renamed_102;
    private final byte[] cfr_renamed_93;
    private static sprtzf cfr_renamed_86;
    private final sprsuf cfr_renamed_152;
    private final Map<sprtzf, byte[]> cfr_renamed_112;
    private static sprtzf[] cfr_renamed_119;
    private int cfr_renamed_91;
    private final sprgzf cfr_renamed_0;
    private final sprgf cfr_renamed_1;
    private sprbxf cfr_renamed_2;
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_6439() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public synchronized int cfr_renamed_320() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_6480(int arg0) {
        if (arg0 < this.cfr_renamed_102) {
            return this.cfr_renamed_6481(arg0 < cfr_renamed_119.length ? cfr_renamed_119[arg0] : new sprtzf(arg0));
        }
        return this.cfr_renamed_6482(arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxag cfr_renamed_6483() {
        spriyf spriyf2 = this;
        synchronized (spriyf2) {
            spriyf spriyf3 = this;
            if (spriyf3.cfr_renamed_91 >= spriyf3.cfr_renamed_3) {
                throw new sprjig(sprngk.cfr_renamed_9("\u001eV\u0002\u0002\u0001P\u0018T\u0010V\u0014\u0002\u001aG\b\u0002\u0014Z\u0019C\u0004Q\u0005G\u0015"));
            }
            spriyf spriyf4 = this;
            spriyf spriyf5 = this;
            sprxag sprxag2 = new sprxag(spriyf4.cfr_renamed_152, spriyf4.cfr_renamed_4, spriyf5.cfr_renamed_91, spriyf5.cfr_renamed_93);
            this.cfr_renamed_6484();
            return sprxag2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbxf cfr_renamed_1157() {
        spriyf spriyf2 = this;
        synchronized (spriyf2) {
            if (this.cfr_renamed_2 == null) {
                spriyf spriyf3 = this;
                this.cfr_renamed_2 = new sprbxf(this.cfr_renamed_0, this.cfr_renamed_152, this.cfr_renamed_6481(cfr_renamed_86), this.cfr_renamed_4);
            }
            return this.cfr_renamed_2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriyf(spriyf spriyf2, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        spriyf spriyf3 = this;
        spriyf spriyf4 = this;
        spriyf spriyf5 = this;
        spriyf spriyf6 = this;
        super(true);
        spriyf6.cfr_renamed_0 = arg0.cfr_renamed_0;
        spriyf6.cfr_renamed_152 = arg0.cfr_renamed_152;
        spriyf5.cfr_renamed_91 = arg1;
        spriyf5.cfr_renamed_4 = arg0.cfr_renamed_4;
        spriyf4.cfr_renamed_3 = arg2;
        spriyf4.cfr_renamed_93 = arg0.cfr_renamed_93;
        spriyf3.cfr_renamed_102 = 1 << this.cfr_renamed_0.cfr_renamed_1153();
        spriyf3.cfr_renamed_112 = arg0.cfr_renamed_112;
        this.cfr_renamed_1 = sprieg.cfr_renamed_6485(this.cfr_renamed_0);
        this.cfr_renamed_2 = spriyf2.cfr_renamed_2;
    }

    public sprgzf cfr_renamed_6477() {
        return this.cfr_renamed_0;
    }

    public synchronized void cfr_renamed_6484() {
        ++this.cfr_renamed_91;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static spriyf cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof spriyf) {
            return (spriyf)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream)arg0;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException(sprrbfa.cfr_renamed_9("P\nE\u0017V\u0006P\u0016\u0015\u0004P\u0000F\u001bZ\u001c\u0015B\u0015\u001eX\u0001\u0015\u0002G\u001bC\u0013A\u0017\u0015\u0019P\u000b"));
            }
            DataInputStream dataInputStream2 = dataInputStream;
            sprgzf sprgzf2 = sprgzf.cfr_renamed_6470(dataInputStream2.readInt());
            sprsuf sprsuf2 = sprsuf.cfr_renamed_6470(dataInputStream2.readInt());
            byte[] byArray = new byte[16];
            dataInputStream2.readFully(byArray);
            int n = dataInputStream2.readInt();
            int n2 = dataInputStream2.readInt();
            int n3 = dataInputStream2.readInt();
            if (n3 < 0) {
                throw new IllegalStateException(sprngk.cfr_renamed_9("Q\u0014A\u0003G\u0005\u0002\u001dG\u001fE\u0005JQN\u0014Q\u0002\u0002\u0005J\u0010LQX\u0014P\u001e"));
            }
            if (n3 > dataInputStream.available()) {
                throw new IOException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9("\u0001P\u0011G\u0017ARY\u0017[\u0015A\u001a\u0015\u0017M\u0011P\u0017Q\u0017QR")).append(dataInputStream.available()).toString());
            }
            byte[] byArray2 = new byte[n3];
            dataInputStream.readFully(byArray2);
            return new spriyf(sprgzf2, sprsuf2, n, byArray, n2, byArray2);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                spriyf spriyf2 = spriyf.cfr_renamed_23(inputStream);
                return spriyf2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return spriyf.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprngk.cfr_renamed_9("\u0012C\u001fL\u001eVQR\u0010P\u0002GQ")).append(arg0).toString());
    }

    @Override
    public long cfr_renamed_5649() {
        spriyf spriyf2 = this;
        return spriyf2.cfr_renamed_3 - spriyf2.cfr_renamed_91;
    }

    public sprsuf cfr_renamed_6474() {
        return this.cfr_renamed_152;
    }

    @Override
    public sprvcg cfr_renamed_5709() {
        spriyf spriyf2 = this;
        int n = spriyf2.cfr_renamed_6477().cfr_renamed_1153();
        int n2 = spriyf2.cfr_renamed_320();
        sprxag sprxag2 = spriyf2.cfr_renamed_6483();
        int n3 = 0;
        int n4 = (1 << n) + n2;
        byte[][] byArrayArray = new byte[n][];
        int n5 = n3;
        while (n5 < n) {
            int n6 = n4 / (1 << n3) ^ 1;
            byArrayArray[n3++] = this.cfr_renamed_6480(n6);
            n5 = n3;
        }
        return sprxag2.cfr_renamed_6464(this.cfr_renamed_6477(), byArrayArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spriyf cfr_renamed_3249(int arg0) {
        spriyf spriyf2 = this;
        synchronized (spriyf2) {
            if (this.cfr_renamed_91 + arg0 >= this.cfr_renamed_3) {
                throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("\u0007F\u0013R\u0017v\u001d@\u001cARP\nV\u0017P\u0016FR@\u0001T\u0015P\u0001\u0015\u0000P\u001fT\u001b[\u001b[\u0015"));
            }
            spriyf spriyf3 = this;
            this.cfr_renamed_91 += arg0;
            return new spriyf(spriyf3, this.cfr_renamed_91, spriyf3.cfr_renamed_91 + arg0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxag cfr_renamed_6486() {
        spriyf spriyf2 = this;
        synchronized (spriyf2) {
            spriyf spriyf3 = this;
            if (spriyf3.cfr_renamed_91 >= spriyf3.cfr_renamed_3) {
                throw new sprjig(sprngk.cfr_renamed_9("M\u0005QQR\u0003K\u0007C\u0005GQI\u0014[\u0002\u0002\u0014Z\u0001K\u0003G\u0015"));
            }
            spriyf spriyf4 = this;
            spriyf spriyf5 = this;
            return new sprxag(spriyf4.cfr_renamed_152, spriyf4.cfr_renamed_4, spriyf5.cfr_renamed_91, spriyf5.cfr_renamed_93);
        }
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        spriyf spriyf2 = (spriyf)arg0;
        if (this.cfr_renamed_91 != spriyf2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_3 != spriyf2.cfr_renamed_3) {
            return false;
        }
        if (!sproze.cfr_renamed_92(this.cfr_renamed_4, spriyf2.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_0 != null ? !this.cfr_renamed_0.equals(spriyf2.cfr_renamed_0) : spriyf2.cfr_renamed_0 != null) {
            return false;
        }
        if (this.cfr_renamed_152 != null ? !this.cfr_renamed_152.equals(spriyf2.cfr_renamed_152) : spriyf2.cfr_renamed_152 != null) {
            return false;
        }
        if (!sproze.cfr_renamed_92(this.cfr_renamed_93, spriyf2.cfr_renamed_93)) {
            return false;
        }
        if (this.cfr_renamed_2 != null && spriyf2.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.equals(spriyf2.cfr_renamed_2);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public spriyf(sprgzf sprgzf2, sprsuf sprsuf2, int n, byte[] byArray, int n2, byte[] byArray2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spriyf spriyf2 = this;
        spriyf spriyf3 = this;
        spriyf spriyf4 = this;
        spriyf spriyf5 = this;
        super(true);
        spriyf5.cfr_renamed_0 = arg0;
        spriyf5.cfr_renamed_152 = arg1;
        spriyf4.cfr_renamed_91 = arg2;
        spriyf4.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg3);
        spriyf3.cfr_renamed_3 = arg4;
        spriyf3.cfr_renamed_93 = sproze.cfr_renamed_158((byte[])arg5);
        spriyf2.cfr_renamed_102 = 1 << this.cfr_renamed_0.cfr_renamed_1153() + 1;
        spriyf spriyf6 = this;
        spriyf2.cfr_renamed_112 = new WeakHashMap<sprtzf, byte[]>();
        spriyf2.cfr_renamed_1 = sprieg.cfr_renamed_6485(sprgzf2);
    }

    public static spriyf cfr_renamed_5967(byte[] arg0, byte[] arg1) throws IOException {
        spriyf.cfr_renamed_23(arg0).cfr_renamed_2 = sprbxf.cfr_renamed_23(arg1);
        return spriyf.cfr_renamed_23(arg0);
    }

    static {
        int n;
        cfr_renamed_86 = new sprtzf(1);
        cfr_renamed_119 = new sprtzf[129];
        spriyf.cfr_renamed_119[1] = cfr_renamed_86;
        int n2 = n = 2;
        while (n2 < cfr_renamed_119.length) {
            int n3 = n;
            int n4 = n++;
            spriyf.cfr_renamed_119[n4] = new sprtzf(n4);
            n2 = n;
        }
    }

    public int hashCode() {
        int n = this.cfr_renamed_91;
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_4);
        n = 31 * n + (this.cfr_renamed_0 != null ? this.cfr_renamed_0.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_152 != null ? this.cfr_renamed_152.hashCode() : 0);
        n = 31 * n + this.cfr_renamed_3;
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_93);
        n = 31 * n + (this.cfr_renamed_2 != null ? this.cfr_renamed_2.hashCode() : 0);
        return n;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(0).cfr_renamed_5940(this.cfr_renamed_0.cfr_renamed_324()).cfr_renamed_5940(this.cfr_renamed_152.cfr_renamed_324()).cfr_renamed_6450(this.cfr_renamed_4).cfr_renamed_5940(this.cfr_renamed_91).cfr_renamed_5940(this.cfr_renamed_3).cfr_renamed_5940(this.cfr_renamed_93.length).cfr_renamed_6450(this.cfr_renamed_93).cfr_renamed_1451();
    }

    public byte[] cfr_renamed_2667() {
        return sproze.cfr_renamed_158(this.cfr_renamed_93);
    }

    private /* synthetic */ byte[] cfr_renamed_6482(int arg0) {
        int n = this.cfr_renamed_6477().cfr_renamed_1153();
        int n2 = 1 << n;
        if (arg0 >= n2) {
            spriyf spriyf2 = this;
            sprpag.cfr_renamed_6455(this.cfr_renamed_6439(), spriyf2.cfr_renamed_1);
            sprpag.cfr_renamed_6460(arg0, this.cfr_renamed_1);
            sprpag.cfr_renamed_6461((short)-32126, this.cfr_renamed_1);
            spriyf spriyf3 = this;
            byte[] byArray = sprqxf.cfr_renamed_6444(spriyf2.cfr_renamed_6474(), spriyf3.cfr_renamed_6439(), arg0 - n2, this.cfr_renamed_2667());
            sprpag.cfr_renamed_6455(byArray, this.cfr_renamed_1);
            byte[] byArray2 = new byte[spriyf2.cfr_renamed_1.cfr_renamed_1218()];
            spriyf3.cfr_renamed_1.cfr_renamed_1219(byArray2, 0);
            return byArray2;
        }
        spriyf spriyf4 = this;
        byte[] byArray = spriyf4.cfr_renamed_6480(2 * arg0);
        byte[] byArray3 = spriyf4.cfr_renamed_6480(2 * arg0 + 1);
        sprpag.cfr_renamed_6455(spriyf4.cfr_renamed_6439(), this.cfr_renamed_1);
        sprpag.cfr_renamed_6460(arg0, this.cfr_renamed_1);
        sprpag.cfr_renamed_6461((short)-31869, this.cfr_renamed_1);
        spriyf spriyf5 = this;
        sprpag.cfr_renamed_6455(byArray, spriyf5.cfr_renamed_1);
        sprpag.cfr_renamed_6455(byArray3, spriyf5.cfr_renamed_1);
        byte[] byArray4 = new byte[spriyf4.cfr_renamed_1.cfr_renamed_1218()];
        spriyf4.cfr_renamed_1.cfr_renamed_1219(byArray4, 0);
        return byArray4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_6481(sprtzf arg0) {
        Map<sprtzf, byte[]> map = this.cfr_renamed_112;
        synchronized (map) {
            byte[] byArray = this.cfr_renamed_112.get(arg0);
            if (byArray != null) {
                return byArray;
            }
            spriyf spriyf2 = this;
            byArray = spriyf2.cfr_renamed_6482(sprtzf.cfr_renamed_6487(arg0));
            spriyf2.cfr_renamed_112.put(arg0, byArray);
            return byArray;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_5712(sprvcg arg0) {
        try {
            return spruzf.cfr_renamed_6488(arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9("@\u001cT\u0010Y\u0017\u0015\u0006ZRP\u001cV\u001dQ\u0017\u0015\u0001\\\u0015[\u0013A\u0007G\u0017\u000fR")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}


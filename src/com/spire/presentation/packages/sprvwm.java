/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprewl;
import com.spire.presentation.packages.sprmgn;
import com.spire.presentation.packages.sprnjj;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprurca;
import com.spire.presentation.packages.sprvfia;

@sprtea
public class sprvwm
extends spreen {
    @sprtea
    public sprmgn cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprvwm(spreen arg0, int arg1) {
        this(arg0, arg1, 6, false);
    }

    public void cfr_renamed_4138(int arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprewl.cfr_renamed_9("Q\u0004f\u001dz\u001ep\t5\u0002w\u0007p\u000eaW5)p\u000by\fa\bF\u0019g\bt\u0000"));
        }
        if (this.cfr_renamed_3.cfr_renamed_91 != null) {
            throw new sprurca(sprnjj.cfr_renamed_9("'\u001b\u0016S\u0004\u001c\u0001\u0018\u001a\u001d\u0014S\u0011\u0006\u0015\u0015\u0016\u0001S\u001a\u0000S\u0012\u001f\u0001\u0016\u0012\u0017\nS\u0000\u0016\u0007]"));
        }
        if (arg0 < 128) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg0;
            throw new sprurca(sprraia.cfr_renamed_11562(sprewl.cfr_renamed_9("Q\u0002{JaMw\b5\u001e|\u0001y\u0014;Mn]hMw\u0014a\bfR*M@\u001epMtMw\u0004r\np\u001f5\u000f`\u000bs\bgC"), objectArray));
        }
        this.cfr_renamed_3.cfr_renamed_105 = arg0;
    }

    public sprvwm(spreen arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, false);
    }

    @Override
    public void cfr_renamed_2637() {
        this.cfr_renamed_11540(true);
    }

    @Override
    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprnjj.cfr_renamed_9("7\u001a\u0000\u0003\u001c\u0000\u0016\u0017S\u001c\u0011\u0019\u0016\u0010\u0007IS7\u0016\u0015\u001f\u0012\u0007\u0016 \u0007\u0001\u0016\u0012\u001e"));
        }
        return this.cfr_renamed_3.cfr_renamed_11556(arg0, arg1, arg2);
    }

    @Override
    public long cfr_renamed_11547(long arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    public void cfr_renamed_11737(int arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprewl.cfr_renamed_9("Q\u0004f\u001dz\u001ep\t5\u0002w\u0007p\u000eaW5)p\u000by\fa\bF\u0019g\bt\u0000"));
        }
        this.cfr_renamed_3.cfr_renamed_107 = arg0;
    }

    public sprvwm(spreen arg0, int arg1, boolean arg2) {
        this(arg0, arg1, 6, arg2);
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprnjj.cfr_renamed_9("7\u001a\u0000\u0003\u001c\u0000\u0016\u0017S\u001c\u0011\u0019\u0016\u0010\u0007IS7\u0016\u0015\u001f\u0012\u0007\u0016 \u0007\u0001\u0016\u0012\u001e"));
        }
        this.cfr_renamed_3.cfr_renamed_4924(arg0, arg1, arg2);
    }

    @Override
    public boolean cfr_renamed_11552() {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprewl.cfr_renamed_9("Q\u0004f\u001dz\u001ep\t5\u0002w\u0007p\u000eaW5)p\u000by\fa\bF\u0019g\bt\u0000"));
        }
        return this.cfr_renamed_3.cfr_renamed_2.cfr_renamed_11552();
    }

    public int cfr_renamed_11707() {
        return this.cfr_renamed_3.cfr_renamed_107;
    }

    public static byte[] cfr_renamed_11549(byte[] arg0) {
        return sprmgn.cfr_renamed_11550(arg0, sprvfia.cfr_renamed_11543(sprvwm.class.getName()));
    }

    @Override
    public boolean cfr_renamed_11557() {
        return false;
    }

    @Override
    public void cfr_renamed_11548(long arg0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cfr_renamed_11540(boolean arg0) {
        if (!this.cfr_renamed_4) {
            if (arg0 && this.cfr_renamed_3 != null) {
                this.cfr_renamed_3.dispose();
            }
            this.cfr_renamed_4 = true;
        }
    }

    @Override
    public boolean cfr_renamed_11560() {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprnjj.cfr_renamed_9("7\u001a\u0000\u0003\u001c\u0000\u0016\u0017S\u001c\u0011\u0019\u0016\u0010\u0007IS7\u0016\u0015\u001f\u0012\u0007\u0016 \u0007\u0001\u0016\u0012\u001e"));
        }
        return this.cfr_renamed_3.cfr_renamed_2.cfr_renamed_11560();
    }

    /*
     * WARNING - void declaration
     */
    public sprvwm(spreen spreen2, int n, int n2, boolean bl) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvwm sprvwm2 = this;
        sprvwm2.cfr_renamed_3 = new sprmgn((spreen)arg0, (int)arg1, (int)arg2, 1951, (boolean)arg3);
    }

    @Override
    public void cfr_renamed_2947() {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprewl.cfr_renamed_9("Q\u0004f\u001dz\u001ep\t5\u0002w\u0007p\u000eaW5)p\u000by\fa\bF\u0019g\bt\u0000"));
        }
        this.cfr_renamed_3.cfr_renamed_2947();
    }

    public static byte[] cfr_renamed_11553(String arg0) {
        return sprmgn.cfr_renamed_11554(arg0, sprvfia.cfr_renamed_11543(sprvwm.class.getName()));
    }

    public long cfr_renamed_11555() {
        return this.cfr_renamed_3.cfr_renamed_79.cfr_renamed_152;
    }

    public void cfr_renamed_11551(int arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprnjj.cfr_renamed_9("7\u001a\u0000\u0003\u001c\u0000\u0016\u0017S\u001c\u0011\u0019\u0016\u0010\u0007IS7\u0016\u0015\u001f\u0012\u0007\u0016 \u0007\u0001\u0016\u0012\u001e"));
        }
        this.cfr_renamed_3.cfr_renamed_3 = arg0;
    }

    @Override
    public void cfr_renamed_11561(long arg0) {
        throw new UnsupportedOperationException();
    }

    public static byte[] cfr_renamed_11544(byte[] arg0) {
        return sprmgn.cfr_renamed_11545(arg0, sprvfia.cfr_renamed_11543(sprvwm.class.getName()));
    }

    @Override
    public void dispose() {
        this.cfr_renamed_11540(true);
    }

    public static String cfr_renamed_11541(byte[] arg0) {
        return sprmgn.cfr_renamed_11542(arg0, sprvfia.cfr_renamed_11543(sprvwm.class.getName()));
    }

    public long cfr_renamed_11559() {
        return this.cfr_renamed_3.cfr_renamed_79.cfr_renamed_93;
    }

    public int cfr_renamed_11546() {
        return this.cfr_renamed_3.cfr_renamed_105;
    }

    @Override
    public long cfr_renamed_806() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long cfr_renamed_3274() {
        if (this.cfr_renamed_3.cfr_renamed_112 == 0) {
            return this.cfr_renamed_3.cfr_renamed_79.cfr_renamed_93;
        }
        if (this.cfr_renamed_3.cfr_renamed_112 == 1) {
            return this.cfr_renamed_3.cfr_renamed_79.cfr_renamed_152;
        }
        return 0L;
    }

    public int cfr_renamed_11558() {
        return this.cfr_renamed_3.cfr_renamed_3;
    }
}


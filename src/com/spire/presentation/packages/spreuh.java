/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprath;
import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnqh;
import com.spire.presentation.packages.sprsmaa;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

public abstract class spreuh {
    public static final sprlsh[] cfr_renamed_91 = new sprlsh[0];
    public sprgxh cfr_renamed_0;
    public sprlsh[] cfr_renamed_1;
    public Hashtable cfr_renamed_2;
    public sprlsh cfr_renamed_3;
    public sprlsh cfr_renamed_4;

    public int hashCode() {
        int n;
        sprgxh sprgxh2 = this.cfr_renamed_1769();
        int n2 = n = null == sprgxh2 ? 0 : ~sprgxh2.hashCode();
        if (!this.cfr_renamed_1952()) {
            spreuh spreuh2 = this.cfr_renamed_1775();
            n ^= spreuh2.cfr_renamed_1832().hashCode() * 17;
            n ^= spreuh2.cfr_renamed_1831().hashCode() * 257;
        }
        return n;
    }

    public final spreuh cfr_renamed_1976() {
        return this.cfr_renamed_1775().cfr_renamed_1977();
    }

    public String toString() {
        if (this.cfr_renamed_1952()) {
            return sprsmaa.cfr_renamed_9(":\u00055");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.cfr_renamed_1953());
        stringBuffer.append(',');
        stringBuffer.append(this.cfr_renamed_1954());
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_1.length) {
            stringBuffer.append(',');
            stringBuffer.append(this.cfr_renamed_1[n++]);
            n2 = n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(')');
        return stringBuffer2.toString();
    }

    public spreuh cfr_renamed_8710(sprlsh arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_8917(this.cfr_renamed_1953().cfr_renamed_8682(arg0), this.cfr_renamed_1954().cfr_renamed_1773(), this.cfr_renamed_1966());
    }

    public sprgxh cfr_renamed_1769() {
        return this.cfr_renamed_0;
    }

    public sprlsh cfr_renamed_1831() {
        return this.cfr_renamed_4;
    }

    public abstract spreuh cfr_renamed_1774();

    public boolean cfr_renamed_1952() {
        return this.cfr_renamed_3 == null || this.cfr_renamed_4 == null || this.cfr_renamed_1.length > 0 && this.cfr_renamed_1[0].cfr_renamed_805();
    }

    public spreuh cfr_renamed_8652(spreuh arg0) {
        return this.cfr_renamed_1774().cfr_renamed_8630(arg0);
    }

    public boolean cfr_renamed_8918(boolean arg0, boolean arg1) {
        if (this.cfr_renamed_1952()) {
            return true;
        }
        return !((sprath)this.cfr_renamed_1769().cfr_renamed_8628(this, "bc_validity", new sprnqh(this, arg0, arg1))).cfr_renamed_8655();
    }

    public byte[] cfr_renamed_1972(boolean arg0) {
        if (this.cfr_renamed_1952()) {
            return new byte[1];
        }
        spreuh spreuh2 = this.cfr_renamed_1775();
        byte[] byArray = spreuh2.cfr_renamed_1832().cfr_renamed_91();
        if (arg0) {
            byte[] byArray2 = new byte[byArray.length + 1];
            byte[] byArray3 = byArray2;
            byArray2[0] = (byte)(spreuh2.cfr_renamed_1956() ? 3 : 2);
            System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
            return byArray3;
        }
        byte[] byArray4 = spreuh2.cfr_renamed_1831().cfr_renamed_91();
        byte[] byArray5 = new byte[byArray.length + byArray4.length + 1];
        byArray5[0] = 4;
        System.arraycopy(byArray, 0, byArray5, 1, byArray.length);
        System.arraycopy(byArray4, 0, byArray5, byArray.length + 1, byArray4.length);
        return byArray5;
    }

    public spreuh cfr_renamed_1771(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprboj.cfr_renamed_9("\u000fo\u000f*KkFdG~\bhM*FoOk\\c^o"));
        }
        spreuh spreuh2 = this;
        while (--arg0 >= 0) {
            spreuh2 = spreuh2.cfr_renamed_1774();
        }
        return spreuh2;
    }

    public boolean cfr_renamed_8919() {
        return this.cfr_renamed_8918(false, false);
    }

    public spreuh cfr_renamed_8709(sprlsh arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_8917(this.cfr_renamed_1953().cfr_renamed_8682(arg0), this.cfr_renamed_1954(), this.cfr_renamed_1966());
    }

    public sprlsh cfr_renamed_1973() {
        spreuh spreuh2 = this;
        spreuh2.cfr_renamed_1963();
        return spreuh2.cfr_renamed_1831();
    }

    public abstract boolean cfr_renamed_1956();

    public final sprlsh cfr_renamed_1954() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_1974() {
        return this.cfr_renamed_8918(false, true);
    }

    public sprlsh cfr_renamed_1964(int arg0) {
        if (arg0 < 0 || arg0 >= this.cfr_renamed_1.length) {
            return null;
        }
        return this.cfr_renamed_1[arg0];
    }

    public boolean cfr_renamed_8920() {
        if (sprck.cfr_renamed_4.equals(this.cfr_renamed_0.cfr_renamed_1843())) {
            return true;
        }
        BigInteger bigInteger = this.cfr_renamed_0.cfr_renamed_1932();
        return bigInteger == null || sprmvh.cfr_renamed_8921(this, bigInteger).cfr_renamed_1952();
    }

    public abstract spreuh cfr_renamed_1977();

    public boolean cfr_renamed_1957() {
        int n = this.cfr_renamed_1958();
        return n == 0 || n == 5 || this.cfr_renamed_1952() || this.cfr_renamed_1[0].cfr_renamed_287();
    }

    public spreuh cfr_renamed_8922(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_1769().cfr_renamed_8923(this.cfr_renamed_1953().cfr_renamed_8682(arg0), this.cfr_renamed_1954().cfr_renamed_8682(arg1));
    }

    public spreuh cfr_renamed_8708(sprlsh arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_8917(this.cfr_renamed_1953().cfr_renamed_1773(), this.cfr_renamed_1954().cfr_renamed_8682(arg0), this.cfr_renamed_1966());
    }

    /*
     * Enabled aggressive block sorting
     */
    public spreuh cfr_renamed_1775() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        switch (this.cfr_renamed_1958()) {
            case 0: 
            case 5: {
                return this;
            }
        }
        sprlsh sprlsh2 = this.cfr_renamed_1964(0);
        if (sprlsh2.cfr_renamed_287()) {
            return this;
        }
        if (null == this.cfr_renamed_0) {
            throw new IllegalStateException(sprsmaa.cfr_renamed_9("7.\u0007*\u0010#\u0016/S;\u001c\"\u001d?\u0000k\u001e>\u0000?S)\u0016k\u001a%S*\u0015-\u001a%\u0016k\u0010$\u001c9\u0017\"\u001d*\u0007.\u0000"));
        }
        SecureRandom secureRandom = sprybl.cfr_renamed_2794();
        spreuh spreuh2 = this;
        sprlsh sprlsh3 = spreuh2.cfr_renamed_0.cfr_renamed_8924(secureRandom);
        return spreuh2.cfr_renamed_8925(sprlsh2.cfr_renamed_8682(sprlsh3).cfr_renamed_952().cfr_renamed_8682(sprlsh3));
    }

    public spreuh cfr_renamed_1830(BigInteger arg0) {
        return this.cfr_renamed_1769().cfr_renamed_1967().cfr_renamed_8926(this, arg0);
    }

    public sprlsh cfr_renamed_1969() {
        spreuh spreuh2 = this;
        spreuh2.cfr_renamed_1963();
        return spreuh2.cfr_renamed_1832();
    }

    public sprlsh cfr_renamed_1832() {
        return this.cfr_renamed_3;
    }

    public abstract spreuh cfr_renamed_8630(spreuh var1);

    /*
     * Enabled aggressive block sorting
     */
    public spreuh cfr_renamed_8925(sprlsh arg0) {
        switch (this.cfr_renamed_1958()) {
            case 1: 
            case 6: {
                sprlsh sprlsh2 = arg0;
                return this.cfr_renamed_8922(sprlsh2, sprlsh2);
            }
            case 2: 
            case 3: 
            case 4: {
                sprlsh sprlsh3 = arg0.cfr_renamed_1048();
                sprlsh sprlsh4 = sprlsh3.cfr_renamed_8682(arg0);
                return this.cfr_renamed_8922(sprlsh3, sprlsh4);
            }
        }
        throw new IllegalStateException(sprboj.cfr_renamed_9("Fe\\*I*XxG`Mi\\c^o\biGeZnAdI~M*[s[~Mg"));
    }

    public boolean cfr_renamed_8927(spreuh arg0) {
        spreuh spreuh2;
        if (null == arg0) {
            return false;
        }
        sprgxh sprgxh2 = this.cfr_renamed_1769();
        sprgxh sprgxh3 = arg0.cfr_renamed_1769();
        boolean bl = null == sprgxh2;
        boolean bl2 = null == sprgxh3;
        boolean bl3 = this.cfr_renamed_1952();
        boolean bl4 = arg0.cfr_renamed_1952();
        if (bl3 || bl4) {
            return bl3 && bl4 && (bl || bl2 || sprgxh2.cfr_renamed_8896(sprgxh3));
        }
        spreuh spreuh3 = this;
        spreuh spreuh4 = arg0;
        if (bl && bl2) {
            spreuh2 = spreuh3;
        } else if (bl) {
            spreuh4 = spreuh4.cfr_renamed_1775();
            spreuh2 = spreuh3;
        } else if (bl2) {
            spreuh2 = spreuh3 = spreuh3.cfr_renamed_1775();
        } else {
            if (!sprgxh2.cfr_renamed_8896(sprgxh3)) {
                return false;
            }
            spreuh[] spreuhArray = new spreuh[2];
            spreuhArray[0] = this;
            spreuhArray[1] = sprgxh2.cfr_renamed_8928(spreuh4);
            spreuh[] spreuhArray2 = spreuhArray;
            sprgxh2.cfr_renamed_8691(spreuhArray2);
            spreuh3 = spreuhArray2[0];
            spreuh4 = spreuhArray2[1];
            spreuh2 = spreuh3;
        }
        return spreuh2.cfr_renamed_1832().equals(spreuh4.cfr_renamed_1832()) && spreuh3.cfr_renamed_1831().equals(spreuh4.cfr_renamed_1831());
    }

    public spreuh cfr_renamed_1804() {
        spreuh spreuh2 = this;
        return spreuh2.cfr_renamed_8652(spreuh2);
    }

    public spreuh cfr_renamed_8707(sprlsh arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_8917(this.cfr_renamed_1953(), this.cfr_renamed_1954().cfr_renamed_8682(arg0), this.cfr_renamed_1966());
    }

    public final sprlsh cfr_renamed_1953() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_1963() {
        if (!this.cfr_renamed_1957()) {
            throw new IllegalStateException(sprsmaa.cfr_renamed_9(";\u001c\"\u001d?S%\u001c?S\"\u001dk\u001d$\u0001&\u0012'S-\u001c9\u001e"));
        }
    }

    public final sprlsh[] cfr_renamed_1966() {
        return this.cfr_renamed_1;
    }

    public abstract spreuh cfr_renamed_1773();

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spreuh)) {
            return false;
        }
        return this.cfr_renamed_8927((spreuh)arg0);
    }

    public abstract spreuh cfr_renamed_8929(spreuh var1);

    public abstract boolean cfr_renamed_1971();

    public int cfr_renamed_1958() {
        if (null == this.cfr_renamed_0) {
            return 0;
        }
        return this.cfr_renamed_0.cfr_renamed_1874();
    }

    public spreuh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        sprgxh sprgxh2 = arg0;
        this(sprgxh2, arg1, arg2, spreuh.cfr_renamed_8930(sprgxh2));
    }

    public sprlsh[] cfr_renamed_1955() {
        int n = this.cfr_renamed_1.length;
        if (n == 0) {
            return cfr_renamed_91;
        }
        sprlsh[] sprlshArray = new sprlsh[n];
        System.arraycopy(this.cfr_renamed_1, 0, sprlshArray, 0, n);
        return sprlshArray;
    }

    /*
     * WARNING - void declaration
     */
    public spreuh(sprgxh sprgxh2, sprlsh sprlsh2, sprlsh sprlsh3, sprlsh[] sprlshArray) {
        void arg2;
        void arg1;
        void arg0;
        spreuh spreuh2 = this;
        spreuh spreuh3 = this;
        this.cfr_renamed_2 = null;
        spreuh3.cfr_renamed_0 = arg0;
        spreuh3.cfr_renamed_3 = arg1;
        spreuh2.cfr_renamed_4 = arg2;
        spreuh2.cfr_renamed_1 = sprlshArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprlsh[] cfr_renamed_8930(sprgxh arg0) {
        int n = null == arg0 ? 0 : arg0.cfr_renamed_1874();
        switch (n) {
            case 0: 
            case 5: {
                return cfr_renamed_91;
            }
        }
        sprlsh sprlsh2 = arg0.cfr_renamed_1652(sprck.cfr_renamed_4);
        switch (n) {
            case 1: 
            case 2: 
            case 6: {
                sprlsh[] sprlshArray = new sprlsh[1];
                sprlshArray[0] = sprlsh2;
                return sprlshArray;
            }
            case 3: {
                sprlsh[] sprlshArray = new sprlsh[3];
                sprlshArray[0] = sprlsh2;
                sprlshArray[1] = sprlsh2;
                sprlshArray[2] = sprlsh2;
                return sprlshArray;
            }
            case 4: {
                sprlsh[] sprlshArray = new sprlsh[2];
                sprlshArray[0] = sprlsh2;
                sprlshArray[1] = arg0.cfr_renamed_1778();
                return sprlshArray;
            }
        }
        throw new IllegalArgumentException(sprboj.cfr_renamed_9("\u007fFaFe_d\biGeZnAdI~M*[s[~Mg"));
    }
}


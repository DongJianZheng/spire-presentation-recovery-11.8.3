/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprav;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprqjba;
import java.util.HashMap;
import java.util.Map;

public class sprhgk
implements sprav {
    private Map<Integer, Character> cfr_renamed_3;
    private Map<Character, Integer> cfr_renamed_4;

    public sprhgk(String arg0) {
        this(arg0.toCharArray());
    }

    /*
     * WARNING - void declaration
     */
    public sprhgk(char[] cArray) {
        void arg0;
        int n;
        sprhgk sprhgk2 = this;
        this.cfr_renamed_4 = new HashMap<Character, Integer>();
        sprhgk2.cfr_renamed_3 = new HashMap<Integer, Character>();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            if (this.cfr_renamed_4.containsKey(Character.valueOf((char)arg0[n]))) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprppba.cfr_renamed_9("$a0x)w!`%4+q94$q4q#`%p`}.4!x0|!v%`z4")).append((char)arg0[n]).toString());
            }
            this.cfr_renamed_4.put(Character.valueOf((char)arg0[n]), n);
            this.cfr_renamed_3.put(n, Character.valueOf((char)arg0[n++]));
            n2 = n;
        }
    }

    @Override
    public byte[] cfr_renamed_9907(char[] arg0) {
        byte[] byArray;
        if (this.cfr_renamed_4.size() <= 256) {
            int n;
            byArray = new byte[arg0.length];
            int n2 = n = 0;
            while (n2 != arg0.length) {
                int n3 = n++;
                byArray[n3] = this.cfr_renamed_4.get(Character.valueOf(arg0[n3])).byteValue();
                n2 = n;
            }
        } else {
            int n;
            byArray = new byte[arg0.length * 2];
            int n4 = n = 0;
            while (n4 != arg0.length) {
                int n5 = this.cfr_renamed_4.get(Character.valueOf(arg0[n]));
                byArray[n * 2] = (byte)(n5 >> 8 & 0xFF);
                int n6 = n * 2 + 1;
                byArray[n6] = (byte)(n5 & 0xFF);
                n4 = ++n;
            }
        }
        return byArray;
    }

    @Override
    public int cfr_renamed_9210() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public char[] cfr_renamed_9908(byte[] arg0) {
        char[] cArray;
        if (this.cfr_renamed_3.size() <= 256) {
            int n;
            cArray = new char[arg0.length];
            int n2 = n = 0;
            while (n2 != arg0.length) {
                int n3 = n++;
                cArray[n3] = this.cfr_renamed_3.get(arg0[n3] & 0xFF).charValue();
                n2 = n;
            }
        } else {
            int n;
            if ((arg0.length & 1) != 0) {
                throw new IllegalArgumentException(sprqjba.cfr_renamed_9("'R<\u00051\\'@sW2A:]sD=AsL=U&QsV'W:K4\u0005<A7\u0005?@=B'M"));
            }
            cArray = new char[arg0.length / 2];
            int n4 = n = 0;
            while (n4 != arg0.length) {
                int n5 = n / 2;
                char c = this.cfr_renamed_3.get(arg0[n] << 8 & 0xFF00 | arg0[n + 1] & 0xFF).charValue();
                cArray[n5] = c;
                n4 = n += 2;
            }
        }
        return cArray;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdmia;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sproqn;

public final class sprlln
extends Enum<sprlln> {
    public static final /* enum */ sprlln cfr_renamed_79;
    public static final /* enum */ sprlln cfr_renamed_107;
    public static final /* enum */ sprlln cfr_renamed_132;
    public static final /* enum */ sprlln cfr_renamed_102;
    public static final /* enum */ sprlln cfr_renamed_93;
    public static final /* enum */ sprlln cfr_renamed_86;
    public static final /* enum */ sprlln cfr_renamed_152;
    private int cfr_renamed_112;
    private static final /* synthetic */ sprlln[] cfr_renamed_119;
    private String cfr_renamed_91;
    public static final int cfr_renamed_0 = 11;
    public static final /* enum */ sprlln cfr_renamed_1;
    public static final /* enum */ sprlln cfr_renamed_2;
    public static final /* enum */ sprlln cfr_renamed_3;
    public static final /* enum */ sprlln cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlln(String string2, int string2) {
        void var4_2;
        void arg2;
        void arg1;
        void arg0;
        sprlln sprlln2 = this;
        sprlln2.cfr_renamed_91 = arg2;
        sprlln2.cfr_renamed_112 = var4_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12908(sprlln arg0) {
        switch (sproqn.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                return sprjvo.cfr_renamed_9("=#\u0003#\u0007:\u0006");
            }
            case 2: {
                return sprjzo.cfr_renamed_9("{\u0004V\u0007\\\nW");
            }
            case 3: {
                return "Choice";
            }
            case 4: {
                return sprjvo.cfr_renamed_9("\u000e\u001d?\u001a(\u0006.\u0011");
            }
            case 5: {
                return sprjzo.cfr_renamed_9("/X\u001f\\?P\u0006\\");
            }
            case 6: {
                return sprjvo.cfr_renamed_9("\u0001\u0007\"\u00038\u0018");
            }
            case 7: {
                return sprjzo.cfr_renamed_9("%V\u001f\\");
            }
            case 8: {
                return sprjvo.cfr_renamed_9("\u0003\u001d \n(\u001a");
            }
            case 9: {
                return "Text";
            }
            case 10: {
                return "Url";
            }
            case 11: {
                return "User";
            }
        }
        return sprjzo.cfr_renamed_9("l\u0005R\u0005V\u001cWKt\u000eM\ni\u0019V\u001b\\\u0019M\u0012m\u0012I\u000e\u0019\u001dX\u0007L\u000e\u0017");
    }

    public int cfr_renamed_97() {
        return this.cfr_renamed_112;
    }

    public static sprlln cfr_renamed_5644(String arg0) {
        if (sprjvo.cfr_renamed_9("=#\u0003#\u0007:\u0006").equals(arg0)) {
            return cfr_renamed_152;
        }
        if (sprjzo.cfr_renamed_9("{\u0004V\u0007\\\nW").equals(arg0)) {
            return cfr_renamed_132;
        }
        if ("Choice".equals(arg0)) {
            return cfr_renamed_107;
        }
        if (sprjvo.cfr_renamed_9("\u000e\u001d?\u001a(\u0006.\u0011").equals(arg0)) {
            return cfr_renamed_3;
        }
        if (sprjzo.cfr_renamed_9("/X\u001f\\?P\u0006\\").equals(arg0)) {
            return cfr_renamed_93;
        }
        if (sprjvo.cfr_renamed_9("\u0001\u0007\"\u00038\u0018").equals(arg0)) {
            return cfr_renamed_86;
        }
        if (sprjzo.cfr_renamed_9("%V\u001f\\").equals(arg0)) {
            return cfr_renamed_2;
        }
        if (sprjvo.cfr_renamed_9("\u0003\u001d \n(\u001a").equals(arg0)) {
            return cfr_renamed_79;
        }
        if ("Text".equals(arg0)) {
            return cfr_renamed_1;
        }
        if ("Url".equals(arg0)) {
            return cfr_renamed_102;
        }
        if ("User".equals(arg0)) {
            return cfr_renamed_4;
        }
        throw new IllegalArgumentException(sprjzo.cfr_renamed_9(">W\u0000W\u0004N\u0005\u0019&\\\u001fX;K\u0004I\u000eK\u001f@?@\u001b\\KW\nT\u000e\u0017"));
    }

    static {
        cfr_renamed_152 = new sprlln(sprjvo.cfr_renamed_9("=#\u0003#\u0007:\u0006"), 0, sprjzo.cfr_renamed_9("l\u0005R\u0005V\u001cW"), 0);
        cfr_renamed_132 = new sprlln(sprjvo.cfr_renamed_9("*\"\u0007!\r,\u0006"), 1, sprjzo.cfr_renamed_9("{\u0004V\u0007\\\nW"), 1);
        cfr_renamed_107 = new sprlln("Choice", 2, "Choice", 2);
        cfr_renamed_3 = new sprlln(sprjvo.cfr_renamed_9("\u000e\u001d?\u001a(\u0006.\u0011"), 3, sprjzo.cfr_renamed_9("(L\u0019K\u000eW\b@"), 5);
        cfr_renamed_93 = new sprlln(sprjvo.cfr_renamed_9("\t\t9\r\u0019\u0001 \r"), 4, sprjzo.cfr_renamed_9("/X\u001f\\?P\u0006\\"), 6);
        cfr_renamed_86 = new sprlln(sprjvo.cfr_renamed_9("\u0001\u0007\"\u00038\u0018"), 5, sprjzo.cfr_renamed_9("'V\u0004R\u001eI"), 10);
        cfr_renamed_2 = new sprlln(sprjvo.cfr_renamed_9("\u0003\u00079\r"), 6, sprjzo.cfr_renamed_9("%V\u001f\\"), 14);
        cfr_renamed_79 = new sprlln(sprjvo.cfr_renamed_9("\u0003\u001d \n(\u001a"), 7, sprjzo.cfr_renamed_9("%L\u0006[\u000eK"), 15);
        cfr_renamed_1 = new sprlln("Text", 8, "Text", 16);
        cfr_renamed_102 = new sprlln("Url", 9, "Url", 17);
        cfr_renamed_4 = new sprlln("User", 10, "User", 18);
        sprlln[] sprllnArray = new sprlln[11];
        sprllnArray[0] = cfr_renamed_152;
        sprllnArray[1] = cfr_renamed_132;
        sprllnArray[2] = cfr_renamed_107;
        sprllnArray[3] = cfr_renamed_3;
        sprllnArray[4] = cfr_renamed_93;
        sprllnArray[5] = cfr_renamed_86;
        sprllnArray[6] = cfr_renamed_2;
        sprllnArray[7] = cfr_renamed_79;
        sprllnArray[8] = cfr_renamed_1;
        sprllnArray[9] = cfr_renamed_102;
        sprllnArray[10] = cfr_renamed_4;
        cfr_renamed_119 = sprllnArray;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12948(sprlln arg0) {
        switch (sproqn.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                return sprjvo.cfr_renamed_9("=#\u0003#\u0007:\u0006");
            }
            case 2: {
                return sprjzo.cfr_renamed_9("{\u0004V\u0007\\\nW");
            }
            case 3: {
                return "Choice";
            }
            case 4: {
                return sprjvo.cfr_renamed_9("\u000e\u001d?\u001a(\u0006.\u0011");
            }
            case 5: {
                return sprjzo.cfr_renamed_9("/X\u001f\\?P\u0006\\");
            }
            case 6: {
                return sprjvo.cfr_renamed_9("\u0001\u0007\"\u00038\u0018");
            }
            case 7: {
                return sprjzo.cfr_renamed_9("%V\u001f\\");
            }
            case 8: {
                return sprjvo.cfr_renamed_9("\u0003\u001d \n(\u001a");
            }
            case 9: {
                return "Text";
            }
            case 10: {
                return "Url";
            }
            case 11: {
                return "User";
            }
        }
        return sprjzo.cfr_renamed_9("l\u0005R\u0005V\u001cWKt\u000eM\ni\u0019V\u001b\\\u0019M\u0012m\u0012I\u000e\u0019\u001dX\u0007L\u000e\u0017");
    }

    public static sprlln[] values() {
        return (sprlln[])cfr_renamed_119.clone();
    }

    public static sprlln valueOf(String arg0) {
        return Enum.valueOf(sprlln.class, arg0);
    }

    public static sprlln[] cfr_renamed_205() {
        sprlln[] sprllnArray = new sprlln[11];
        sprllnArray[0] = cfr_renamed_152;
        sprllnArray[1] = cfr_renamed_132;
        sprllnArray[2] = cfr_renamed_107;
        sprllnArray[3] = cfr_renamed_3;
        sprllnArray[4] = cfr_renamed_93;
        sprllnArray[5] = cfr_renamed_86;
        sprllnArray[6] = cfr_renamed_2;
        sprllnArray[7] = cfr_renamed_79;
        sprllnArray[8] = cfr_renamed_1;
        sprllnArray[9] = cfr_renamed_102;
        sprllnArray[10] = cfr_renamed_4;
        return sprllnArray;
    }

    public static sprlln cfr_renamed_12949(int arg0) {
        int n;
        sprlln[] sprllnArray = sprlln.cfr_renamed_205();
        int n2 = n = 0;
        while (n2 < sprllnArray.length) {
            if (arg0 == sprllnArray[n].cfr_renamed_97()) {
                return sprllnArray[n];
            }
            n2 = ++n;
        }
        throw new sprdmia(new StringBuilder().insert(0, sprjvo.cfr_renamed_9("&\"H%\t;\rm\u001c%\u0001>H;\t!\u001d(H")).append(arg0).toString());
    }
}


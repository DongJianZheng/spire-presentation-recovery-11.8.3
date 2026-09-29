/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcl;
import com.spire.presentation.packages.spruofa;
import com.spire.presentation.packages.sprzbs;

public class sprycm
implements sprcl {
    public static int cfr_renamed_7909(int arg0) {
        return (sprycm.cfr_renamed_11041(arg0) + 7) / 8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int cfr_renamed_11041(int arg0) {
        switch (arg0) {
            case 0: {
                throw new IllegalArgumentException(spruofa.cfr_renamed_9("%D']Kx\u00181\u0005~Kt\u0005r\u0019h\u001be\u0002~\u00051\n}\f~\u0019x\u001fy\u0006?"));
            }
            case 6: {
                return 64;
            }
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 7: 
            case 11: {
                return 128;
            }
            case 2: 
            case 8: 
            case 12: {
                return 192;
            }
            case 9: 
            case 10: 
            case 13: {
                return 256;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzbs.cfr_renamed_9("1\u001f/\u001f+\u0006*Q7\b)\u001c!\u00056\u0018'Q%\u001d#\u001e6\u00180\u0019)Kd")).append(arg0).toString());
    }
}


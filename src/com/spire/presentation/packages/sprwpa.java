/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgur;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprw;
import java.util.ArrayList;
import java.util.Collection;

public class sprwpa
implements sprw {
    private Collection cfr_renamed_4;

    public Collection cfr_renamed_172() {
        return new ArrayList(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprwpa(Collection collection) {
        void arg0;
        if (collection == null) {
            throw new NullPointerException(sprgur.cfr_renamed_9("yBvA\u007fNnDuC:N{CtBn\rxH:CoAv"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = stringBuffer.append(sprtsn.cfr_renamed_9("B\u0002*\u000eYXv[\u007fTn^uYICuE\u007fg{E{Z\u007fC\u007fEi\r:l\u0010"));
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprgur.cfr_renamed_9("\r:NuAvHyYsBt\u0017:") + this.cfr_renamed_4 + "\n");
        stringBuffer3.append("]");
        return stringBuffer3.toString();
    }

    public Object clone() {
        return new sprwpa(this.cfr_renamed_4);
    }
}


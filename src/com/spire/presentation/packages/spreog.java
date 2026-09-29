/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprabi;
import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class spreog
implements PolicyNode {
    public Set cfr_renamed_119;
    public boolean cfr_renamed_91;
    public List cfr_renamed_0;
    public int cfr_renamed_1;
    public PolicyNode cfr_renamed_2;
    public String cfr_renamed_3;
    public Set cfr_renamed_4;

    public void cfr_renamed_338(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    public PolicyNode getParent() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_7320(spreog arg0) {
        this.cfr_renamed_0.remove(arg0);
    }

    @Override
    public String getValidPolicy() {
        return this.cfr_renamed_3;
    }

    public Object clone() {
        return this.cfr_renamed_461();
    }

    public Set getPolicyQualifiers() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_336() {
        return !this.cfr_renamed_0.isEmpty();
    }

    public spreog cfr_renamed_461() {
        Iterator iterator;
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            hashSet.add(new String((String)iterator.next()));
            iterator2 = iterator;
        }
        HashSet<String> hashSet2 = new HashSet<String>();
        iterator = this.cfr_renamed_119.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            hashSet2.add(new String((String)iterator.next()));
            iterator3 = iterator;
        }
        spreog spreog2 = new spreog(new ArrayList(), this.cfr_renamed_1, hashSet, null, hashSet2, new String(this.cfr_renamed_3), this.cfr_renamed_91);
        iterator = this.cfr_renamed_0.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            spreog spreog3 = ((spreog)iterator.next()).cfr_renamed_461();
            iterator4 = iterator;
            spreog spreog4 = spreog3;
            spreog spreog5 = spreog2;
            spreog4.cfr_renamed_7321(spreog5);
            spreog5.cfr_renamed_7322(spreog4);
        }
        return spreog2;
    }

    /*
     * WARNING - void declaration
     */
    public spreog(List list, int n, Set set, PolicyNode policyNode, Set set2, String string, boolean bl) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spreog spreog2 = this;
        spreog spreog3 = this;
        spreog spreog4 = this;
        this.cfr_renamed_0 = arg0;
        spreog4.cfr_renamed_1 = arg1;
        spreog4.cfr_renamed_4 = arg2;
        spreog3.cfr_renamed_2 = arg3;
        spreog3.cfr_renamed_119 = arg4;
        spreog2.cfr_renamed_3 = arg5;
        spreog2.cfr_renamed_91 = bl;
    }

    @Override
    public int getDepth() {
        return this.cfr_renamed_1;
    }

    public Iterator getChildren() {
        return this.cfr_renamed_0.iterator();
    }

    public void cfr_renamed_7322(spreog arg0) {
        this.cfr_renamed_0.add(arg0);
        arg0.cfr_renamed_7321(this);
    }

    public String toString() {
        return this.cfr_renamed_2223("");
    }

    public void cfr_renamed_5094(Set arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public String cfr_renamed_2223(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(arg0);
        stringBuffer.append(this.cfr_renamed_3);
        stringBuffer.append(DataColumn.cfr_renamed_9("R\nx"));
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_0.size()) {
            spreog spreog2 = (spreog)this.cfr_renamed_0.get(n);
            stringBuffer.append(spreog2.cfr_renamed_2223(new StringBuilder().insert(0, arg0).append("    ").toString()));
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(arg0);
        stringBuffer.append(sprabi.cfr_renamed_9("_w"));
        return stringBuffer2.toString();
    }

    public Set getExpectedPolicies() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean isCritical() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_7321(spreog arg0) {
        this.cfr_renamed_2 = arg0;
    }
}


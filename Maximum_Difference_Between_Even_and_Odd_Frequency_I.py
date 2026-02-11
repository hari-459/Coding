class Solution:
    def maxDifference(self, s: str) -> int:
        l=list(s)
        t=set(l)
        o=[]
        e=[]
        m=[]
        for i in t:
            if l.count(i)%2==0:
                e.append(l.count(i))
            elif l.count(i)%2!=0:
                o.append(l.count(i))
        for i in o:
            for j in e:
                m.append(i-j)
        return max(m)

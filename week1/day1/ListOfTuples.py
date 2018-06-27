def merge_ranges(l):
    if len(l) <= 1:
        return l

    l = sorted(l)
    tup = [l[0]]
    for (i, j) in l:
        (k, l) = tup[-1]
        if i <= l:
            if l <= j:
                l = j
            tup[-1] = (k, l)
        else:
            tup.append((i, j))
    return tup

package algorithm.binarySearch

fun main(){
    val sortedList = intArrayOf(1,2,3,4,5,6)
    val target = 6
    binarySearchBasic(sortedList, target).run(::print)
}

fun binarySearchBasic(nums: IntArray, target: Int): Int{

    if (nums.size == 0) return -1

    var (l, r) = Pair(0, nums.lastIndex)

    while (l <= r) {
        val mid = l + (r - l) / 2
        when {
            (nums[mid] > target) -> r = mid-1
            (nums[mid] < target) -> l = mid+1
            else -> return mid
        }
    }
    return -1
}

fun binarySearchAdvanced(nums: IntArray, target: Int): Int{

    if (nums.size == 0) return -1

    var (l, r) = Pair(0, nums.lastIndex)

    while (l < r) {
        val mid = l + (r - l) / 2
        when {
            (nums[mid] > target) -> r = mid
            (nums[mid] < target) -> l = mid+1
            else -> return mid
        }
    }

    // post-processing
    if (l != nums.size && nums[l] == target) return l

    return -1
}

fun binarySearchAlternative(nums: IntArray, target: Int): Int {
    if (nums.size == 0) return -1

    var (l, r) = Pair(0, nums.lastIndex)
    while (l+1 < r) {
        val mid = l + (r - l) / 2
        when {
            target > nums[mid] -> l = mid
            target < nums[mid] -> r = mid
            else -> return mid
        }
    }

    when {
        nums[l] == target -> return l
        nums[r] == target -> return r
        else -> return -1
    }
}

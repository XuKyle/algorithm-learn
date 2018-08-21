package leetcode


/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
object Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return IntArray(2)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(Solution.twoSum(intArrayOf(1, 2, 3, 4, 5, 6, 7), 6).toList())
    }
}

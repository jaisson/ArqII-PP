
#include <stdio.h>
#include <omp.h>

int main() {
  int ID = omp_get_num_procs();
  printf(" Nr CPUs: (%d) ", ID);
}


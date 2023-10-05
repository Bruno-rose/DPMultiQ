# Scala Implementation of _dp_multiq_

This GitHub repository contains a Scala implementation of the code originally found in the google-research [repository](https://github.com/google-research/google-research/tree/master/dp_multiq). This project aims to provide an alternative implementation of the same functionality using the Scala programming language.

## Overview

The original repository implements JointExp (and IndExp) as detailed in [Differentially Private Quantiles](https://arxiv.org/abs/2102.08244).  JointExp is carefully structured to allow for an efficient implementation that returns estimates of all m quantiles in time $O(mnlog(n)+m2n)$. Experiments show that our method significantly outperforms the current state of the art on both real and synthetic data while remaining efficient enough to be practical.
## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

[Specify any prerequisites or dependencies that need to be installed before running the Scala code.]

### Installing

[Provide step-by-step instructions for installing the Scala project, including any necessary setup or configuration.]

### Usage

[Explain how to use the Scala implementation, including command-line arguments or examples.]

## Folder Structure

Explain the structure of your project repository, highlighting key directories and files.

```
- src/main/scala/DPMultiQ   # Source code files
- README.md                 # Project documentation (this file)
- LICENSE                   # License information
```

## Running Tests

If you have included unit tests, explain how to run them.

```bash
$ sbt test
```

## Contributing

This project is no longer actively supported or maintained. As such, we are not accepting new contributions, pull requests, or bug reports. Feel free to fork the project if you wish to continue its development independently.

## License

This project is licensed under the **Apache License 2.0** - see the [LICENSE](LICENSE.XSCORE) file for details.

## Acknowledgments

- Credit to the original authors of the implementation listed in [AUTHORS](AUTHORS.XSCORE).
- Credit to the original authors of the paper listed in [Differentially Private Quantiles](https://arxiv.org/abs/2102.08244).

## Author

- Bruno Rodríguez
- bruno.rodriguez at ug.uchile.cl

## Related Repositories

- [Original Repository](https://github.com/google-research/google-research/tree/master/dp_multiq)

## Feedback and Support

If you hace any doubt or suggestion, please contact me via bruno.rodriguez at ug.uchile.cl

## Disclaimer

This is not an official Google product.